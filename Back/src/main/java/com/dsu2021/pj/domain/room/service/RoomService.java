package com.dsu2021.pj.domain.room.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.dto.RoomDTO.RoomHostReq.ImagePath;
import com.dsu2021.pj.domain.room.entity.AvailableDate;
import com.dsu2021.pj.domain.room.entity.Facility;
import com.dsu2021.pj.domain.room.entity.Information;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.room.entity.RoomImagePath;
import com.dsu2021.pj.domain.room.repository.RoomMapper;
import com.dsu2021.pj.domain.room.service.RoomService;

@Service
public class RoomService{
	
	//READ
	
	@Autowired
	private RoomMapper roomMapper;
	
	public List<RoomDTO.RoomRes> search15Rooms(Integer page, RoomDTO.RoomReq req){
		Integer index = ( page - 1 ) * 15;
		
		List<RoomDTO.RoomRes> rooms;
		
		if(req.getCheckInDate() == null || req.getCheckOutDate() == null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
				req = new RoomDTO.RoomReq(req,sdf.parse("0000.01.01"),sdf.parse("9999.12.31"));
				rooms = roomMapper.search15Rooms(index, req, 0);
				System.out.println(req);
				System.out.println(sdf.parse("0000.01.01"));
				System.out.println(sdf.parse("9999.12.31"));
				return rooms;
			} catch (ParseException e) {
				// 일어날리 없는 에러
			}
		}
		
		Long differenceTime = req.getCheckInDate().getTime() - req.getCheckOutDate().getTime();
		int differenceDay = (int) Math.abs(differenceTime/(24*60*60*1000));
		
		rooms = roomMapper.search15Rooms(index,req,differenceDay);
		
		return rooms;
	}
	
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex){
		RoomDTO.RoomRes room = roomMapper.getRoomByIndex(roomIndex);
		return room;
	}
	
	public List<RoomDTO.RoomRes> get15RoomsByPage(Integer page){ // 안 쓰임
		Integer index = ( page - 1 ) * 15;
		List<RoomDTO.RoomRes> rooms = roomMapper.get15RoomsFromIndex(index);
		return rooms;
	}
	
	//CREATE
	
	@Transactional
	public RoomDTO.RoomHostRes insertRoom(RoomDTO.RoomHostReq req){ // facility, information 값 검증 추가 필요
		
		RoomDTO.RoomAddressReq addressInfo = new RoomDTO.RoomAddressReq(null,req.getSiDo(),req.getSiGunGu(),req.getEupMyeonDong(),req.getRoadName(),req.getDetailAddress());
		Long addressIndex = roomMapper.getRoomAddressIndex(addressInfo);
		if(addressIndex == null) {
			roomMapper.insertAddress(addressInfo);
			addressIndex = roomMapper.getRoomAddressIndex(addressInfo);
		}
		
		RoomDTO.RoomCategoryReq categoryInfo = new RoomDTO.RoomCategoryReq(null,req.getLocation(),req.getKind());
		Long categoryIndex = roomMapper.getRoomCategoryIndex(categoryInfo);
		if(categoryIndex == null) {
			roomMapper.insertCategory(categoryInfo);
			categoryIndex = roomMapper.getRoomCategoryIndex(categoryInfo);
		}
		
		Long userIndex = 1l;// 로그인 구현되면 그에 맞게 index가져오도록 수정 필요
		
		Room roomInfo = new Room(null,userIndex,addressIndex,categoryIndex,req.getName(),req.getPrice(),req.getCleanPrice(),req.getMaxPerson(),req.getContent());
		roomMapper.insertRoom(roomInfo);
		Long roomIndex = roomMapper.getRoomIndex(roomInfo);
		
		//이미지 경로 DB에 저장하는 로직 작성할 것
		for(int i = 0 ; i < req.getImagePaths().length ; i++) {
			roomMapper.insertRoomImagePath(new RoomImagePath(roomIndex,req.getImagePaths()[i].getImageNumber(),req.getImagePaths()[i].getImagePath()));
		}
		
		roomMapper.insertFacility(new Facility(roomIndex,req.getBed(),req.getBath(),req.getTv(),req.getHairDryer(),req.getFireExtinguisher(),req.getRefrigerator(),req.getMicrowave(),req.getCookware(),req.getPark(),req.getAircon(),req.getKitchen(),req.getWifi(),req.getWashingMachine()));
		roomMapper.insertInformation(new Information(roomIndex,req.getSelfCheckIn(),req.getCommonSolo()));
		
		for(int i = 0 ; i < req.getAvailableDates().length ; i++) {
			roomMapper.insertAvailableDate(new AvailableDate(roomIndex,req.getAvailableDates()[i] ));
		}
		
		//이미지 저장 로직 작성할 것
		
		return new RoomDTO.RoomHostRes(roomIndex);
	}
	
}
