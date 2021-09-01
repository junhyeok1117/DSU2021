package com.dsu2021.pj.domain.room.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.entity.AvailableDate;
import com.dsu2021.pj.domain.room.entity.Category;
import com.dsu2021.pj.domain.room.entity.Facility;
import com.dsu2021.pj.domain.room.entity.Information;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.room.entity.RoomAddress;
import com.dsu2021.pj.domain.room.entity.RoomImagePath;


@Mapper
@Repository
public interface RoomMapper {
	
//	READ
	
	public List<RoomDTO.RoomRes> search15Rooms(Integer index, RoomDTO.RoomReq req, Integer differenceDay);
	
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex);

	public List<RoomDTO.RoomRes> get15RoomsFromIndex(Integer index); // 이걸 사용하는 곳이 아직 없음
	
	public Long getRoomAddressIndex(RoomAddress req);
	
	public Long getRoomCategoryIndex(Category req);
	
	public Long getLatestRoomIndex(Room room);
	
	public Date[] getAvailableDatesByRoomIndex(Long roomIndex);
	
	public RoomDTO.RoomInformationRes getInformationByRoomIndex(Long roomIndex);
	
	public RoomDTO.RoomFacilityRes getFacilityByRoomIndex(Long roomIndex);
	
	public RoomDTO.RoomAddressRes getAddressByRoomAddressIndex(Long roomAddressIndex);
	
	public RoomDTO.RoomCategoryRes getCategoryByCategoryIndex(Long categoryIndex);
	
//	CREATE
	
	public void insertAddress(RoomAddress req);
	
	public void insertCategory(Category req);
	
	public void insertRoom(Room room);
	
	public void insertRoomImagePath(RoomImagePath roomImagePath);

	public void insertFacility(Facility facility);
	
	public void insertInformation(Information information);
	
	public void insertAvailableDate(AvailableDate availableDate);
	
// PATCH
	
	
	
	
// PUT
	
	

}
