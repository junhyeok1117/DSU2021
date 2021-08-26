package com.dsu2021.pj.domain.room.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.dto.RoomDTO.RoomCategoryReq;


@Mapper
@Repository
public interface RoomMapper {
	
//	READ
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex);
	
	public List<RoomDTO.RoomRes> search15Rooms(Integer index, RoomDTO.RoomReq req, Integer differenceDay);

	public List<RoomDTO.RoomRes> get15RoomsByIndex(Integer index);
	
	public Long getRoomAddressIndex(RoomDTO.RoomAddressReq req);
	
	public Long getRoomCategoryIndex(RoomDTO.RoomCategoryReq req);
	
//	CREATE
	
	public void insertAddress(RoomDTO.RoomAddressReq req);
	
	public void insertCategory(RoomDTO.RoomCategoryReq req);
	
	
	public void insertRoom();

	

}
