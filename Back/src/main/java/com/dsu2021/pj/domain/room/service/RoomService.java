package com.dsu2021.pj.domain.room.service;

import java.util.List;

import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;

public interface RoomService {
	
	public List<SearchedRoomDTO> searchRoom(SearchRoomRestDTO searchRoomRestDTO);
}
