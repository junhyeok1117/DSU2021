package com.dsu2021.pj.domain.room.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.dsu2021.pj.domain.room.dto.RoomDTO;


@Mapper
@Repository
public interface RoomMapper {

	public List<RoomDTO.RoomRes> get15RoomsByIndex(Integer index);
	
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex);
	
	public List<RoomDTO.RoomRes> search15Rooms(Integer page, RoomDTO.RoomReq req);
}
