package com.dsu2021.pj.domain.room.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.room.dto.DetailRoomDTO;
import com.dsu2021.pj.domain.room.dto.FilteredRoomDTO;
import com.dsu2021.pj.domain.room.dto.ReviewStatisticDTO;
import com.dsu2021.pj.domain.room.dto.RoomImagePathDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.room.repository.RoomMapper;
import com.dsu2021.pj.domain.room.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomMapper roomMapper;
	
	@Override
	public ResponseEntity<List<SearchedRoomDTO>> searchRoom(SearchRoomRestDTO searchRoomRestDTO) { // 미구현 기능 1) 체크인 체크아웃 검색 2) 위시리스트 정보 가져오기
		
		List<FilteredRoomDTO> filteredRooms;
		
		if(searchRoomRestDTO.getPage() == null || searchRoomRestDTO.getPage().equals("")) { // 페이지 파라미터 여부에 따라 다른 쿼리 호출
		filteredRooms = roomMapper.filterRoom(searchRoomRestDTO);
		}else {
			searchRoomRestDTO.setPage((searchRoomRestDTO.getPage()-1)*10);
			filteredRooms = roomMapper.filterRoomWithPage(searchRoomRestDTO);
		}
		//한번에 받을 수 있는 테이블 3개만 조인 후 검색조건에 맞게 필터링해서 가져옴
		ArrayList<String> roomIndexs = new ArrayList<>();
		ArrayList<ArrayList<String>> facilities = new ArrayList<>();
		
		for(FilteredRoomDTO room : filteredRooms) { // 시설은 String 배열로 만들어야 하기 때문에 반복문을 돌림
			roomIndexs.add(Long.toString(room.getRoomIndex()));
			
			ArrayList<String> facility = new ArrayList<>();
			if(room.getTv() != null && room.getTv().equals("true"))
				{facility.add("TV");}
			if(room.getHairDryer() != null && room.getHairDryer().equals("true"))
				{facility.add("헤어드라이어");}
			if(room.getFireExtinguisher() != null && room.getFireExtinguisher().equals("true"))
				{facility.add("소화기");}
			if(room.getRefrigerator() != null && room.getRefrigerator().equals("true"))
				{facility.add("냉장고");}
			if(room.getMicrowave() != null && room.getMicrowave().equals("true"))
				{facility.add("전자레인지");}
			if(room.getCookware() != null && room.getCookware().equals("true"))
				{facility.add("조리도구");}
			if(room.getPark() != null && room.getPark().equals("true"))
				{facility.add("주차장");}
			if(room.getAircon() != null && room.getAircon().equals("true"))
				{facility.add("에어컨");}
			if(room.getKitchen() != null && room.getKitchen().equals("true"))
				{facility.add("주방");}
			if(room.getWifi() != null && room.getWifi().equals("true"))
				{facility.add("WIFI");}
			if(room.getWashingMachine() != null && room.getWashingMachine().equals("true"))
				{facility.add("세탁기");}
			
			facilities.add(facility);
		}
		// 여기서부턴 아직 받아오지 못한 이미지 경로, 별점, 리뷰수 등을 받기 시작
		List<RoomImagePathDTO> roomImagePathDTOs = roomMapper.searchImagesByString(String.join(",",roomIndexs)); 
		Map<Long, ArrayList<String>> pathMap = new HashMap<Long,ArrayList<String>>();
		
		for( int i = 0 ; i < roomImagePathDTOs.size() ; i++ ) {
			
			if( !pathMap.containsKey(roomImagePathDTOs.get(i).getRoomIndex()) ) {
				ArrayList<String> array = new ArrayList<>();
				pathMap.put(roomImagePathDTOs.get(i).getRoomIndex(),array);
			}
			pathMap.get(roomImagePathDTOs.get(i).getRoomIndex()).add(roomImagePathDTOs.get(i).getImagePath());

		}
		
		
		List<ReviewStatisticDTO> reviewStatistics = new ArrayList<>();
		for( String index : roomIndexs ) {
			reviewStatistics.add(roomMapper.getReviewStatisticByRoomIndex(index));
		}
		
		
		List<SearchedRoomDTO> rooms = new ArrayList<SearchedRoomDTO>();
		
		for( int i = 0 ; i < roomIndexs.size() ; i++ ) {
			SearchedRoomDTO room = new SearchedRoomDTO(
					filteredRooms.get(i).getRoomIndex(),
					pathMap.get(filteredRooms.get(i).getRoomIndex()),
					filteredRooms.get(i).getLocation(),
					filteredRooms.get(i).getKind(),
					filteredRooms.get(i).getName(),
					filteredRooms.get(i).getMaxPerson(),
					filteredRooms.get(i).getBed(),
					filteredRooms.get(i).getBath(),
					facilities.get(i),
					reviewStatistics.get(i).getStarRating(),
					reviewStatistics.get(i).getCount(),
					false
					);
			rooms.add(room);
		}
		
		return new ResponseEntity<List<SearchedRoomDTO>>(rooms,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<DetailRoomDTO> getDetailRoom(String room_index) {
		
		
		
		
		return null;
	}
	
	@Override
	public ResponseEntity<List<Room>> getAllRooms(){
		return new ResponseEntity<>(roomMapper.selectAllRooms(),HttpStatus.ACCEPTED);
	}

}
