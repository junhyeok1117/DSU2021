package com.dsu2021.pj.domain.room.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.dto.RoomDTO.RoomCategoryReq;
import com.dsu2021.pj.domain.room.entity.AvailableDate;
import com.dsu2021.pj.domain.room.entity.Facility;
import com.dsu2021.pj.domain.room.entity.Information;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.room.entity.RoomImagePath;


@Mapper
@Repository
public interface RoomMapper {
	
//	READ
	public List<RoomDTO.RoomRes> search15Rooms(Integer index, RoomDTO.RoomReq req, Integer differenceDay);
	
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex);

	public List<RoomDTO.RoomRes> get15RoomsFromIndex(Integer index); // 안 쓰임
	
	
	public Long getRoomAddressIndex(RoomDTO.RoomAddressReq req);
	
	public Long getRoomCategoryIndex(RoomDTO.RoomCategoryReq req);
	
	public Long getRoomIndex(Room room);
	
//	CREATE
	
	public void insertAddress(RoomDTO.RoomAddressReq req);
	
	public void insertCategory(RoomDTO.RoomCategoryReq req);
	
	public void insertRoom(Room room);
	
	public void insertRoomImagePath(RoomImagePath roomImagePath);

	public void insertFacility(Facility facility);
	
	public void insertInformation(Information information);
	
	public void insertAvailableDate(AvailableDate availableDate);

}
