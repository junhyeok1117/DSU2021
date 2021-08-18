package com.dsu2021.pj.domain.room.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.room.dto.DetailRoomDTO;
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
