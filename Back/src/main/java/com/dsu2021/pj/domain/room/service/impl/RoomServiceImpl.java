package com.dsu2021.pj.domain.room.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.dsu2021.pj.domain.room.dto.DetailRoomDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.room.repository.RoomMapper;
import com.dsu2021.pj.domain.room.service.RoomService;


public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomMapper roomMapper;
	
	@Override
	public ResponseEntity<List<SearchedRoomDTO>> searchRoom(SearchRoomRestDTO searchRoomRestDTO) {
		return null;
	}

	@Override
	public ResponseEntity<DetailRoomDTO> getDetailRoom(String room_index) {
		return null;
	}

}
