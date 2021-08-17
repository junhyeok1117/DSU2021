package com.dsu2021.pj.domain.room.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
		
        SearchedRoomDTO a = new SearchedRoomDTO(null, null, null, null, null, 0, "asd", 0, 0, false);
        
        
		
        List<SearchedRoomDTO> b = new ArrayList<SearchedRoomDTO>();
        b.add(a);
        
		return new ResponseEntity<>(b,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<DetailRoomDTO> getDetailRoom(String room_index) {
		return null;
	}

}
