package com.dsu2021.pj.domain.room.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.repository.RoomMapper;
import com.dsu2021.pj.domain.room.service.RoomService;

@Service
public class RoomService{
	
	@Autowired
	private RoomMapper roomMapper;
	
	public List<RoomDTO.RoomRes> get15RoomsByPage(Integer page){
		Integer index = ( page - 1 ) * 15;
		List<RoomDTO.RoomRes> rooms = roomMapper.get15RoomsByIndex(index);
		return rooms;
	}
	
	public List<RoomDTO.RoomRes> search15Rooms(Integer page, RoomDTO.RoomReq req){
		List<RoomDTO.RoomRes> rooms = roomMapper.search15Rooms(page,req);
		return rooms;
	}
	
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex){
		RoomDTO.RoomRes room = roomMapper.getRoomByIndex(roomIndex);
		return room;
	}
}
