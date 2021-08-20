package com.dsu2021.pj.domain.room.service.impl;

import java.util.ArrayList;
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
	public ResponseEntity<List<SearchedRoomDTO>> searchRoom(SearchRoomRestDTO searchRoomRestDTO) {
		
		List<FilteredRoomDTO> filteredRooms;
		
		if(searchRoomRestDTO.getPage() == null || searchRoomRestDTO.getPage().equals("")) { // 페이지 파라미터 여부에 따라 다른 쿼리 호출
		filteredRooms = roomMapper.filterRoom(searchRoomRestDTO);
		}else {
			filteredRooms = roomMapper.filterRoomWithPage(searchRoomRestDTO);
		}
		//한번에 받을 수 있는 테이블 3개만 검색조건에 맞게 필터링해서 가져왔다.
		ArrayList<String> roomIndexs = new ArrayList<>();
		ArrayList<ArrayList<String>> facilities = new ArrayList<>();
		
		for(FilteredRoomDTO room : filteredRooms) { // 시설은 String 배열로 만들어야 하기 때문에 반복문을 돌린다.
			roomIndexs.add(Long.toString(room.getRoomIndex()));
			
			ArrayList<String> facility = new ArrayList<>();
			facility.add(room.getTv());
			facility.add(room.getHairDryer());
			facility.add(room.getFireExtinguisher());
			facility.add(room.getRefrigerator());
			facility.add(room.getMicrowave());
			facility.add(room.getCookware());
			facility.add(room.getPark());
			facility.add(room.getAircon());
			facility.add(room.getKitchen());
			facility.add(room.getWifi());
			facility.add(room.getWashingMachine());
			facilities.add(facility);
		}
		// 여기서부턴 아직 받아오지 못한 이미지 경로, 별점, 리뷰수 등을 받기 시작한다.
		List<RoomImagePathDTO> roomImagePathDTOs = roomMapper.searchImagesByString(String.join(",",roomIndexs)); 
		Map<Long, RoomImagePathDTO> pathMap = new HashMap<Long,RoomImagePathDTO>();
		for(int i = 0 ; i<roomImagePathDTOs.size();i++) {
			pathMap.put(roomImagePathDTOs.get(i).getRoomIndex(),roomImagePathDTOs.get(i));
		}
		String[] keys = pathMap.keySet().toArray(new String[pathMap.size()]);
			
		
		List<List<ReviewStatisticDTO>> reviewStatistics = new ArrayList<>();
		for( String index : roomIndexs ) {
			reviewStatistics.add(roomMapper.getReviewStatisticByRoomIndex(index));
		}
		
		
		List<SearchedRoomDTO> rooms = new ArrayList<SearchedRoomDTO>();
		
		for( int i = 0 ; i < roomIndexs.size() ; i++ ) {
			SearchedRoomDTO room = new SearchedRoomDTO(
					roomIndexs.get(i),
					
					);
		}
		
		return null;
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
