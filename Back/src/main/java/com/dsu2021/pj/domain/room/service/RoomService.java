package com.dsu2021.pj.domain.room.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.dsu2021.pj.domain.room.dto.DetailRoomDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.room.entity.Room;

public interface RoomService {
	
	public ResponseEntity<List<SearchedRoomDTO>> searchRoom(SearchRoomRestDTO searchRoomRestDTO);
	
	public ResponseEntity<DetailRoomDTO> getDetailRoom(String room_index);
	
	public ResponseEntity<List<Room>> getAllRooms();
}
