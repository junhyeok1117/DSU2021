package com.dsu2021.pj.domain.room.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.room.dto.DetailRoomDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.room.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	@Override
	public List<SearchedRoomDTO> searchRoom(SearchRoomRestDTO searchRoomRestDTO) {
		return null;
	}

	@Override
	public DetailRoomDTO getDetailRoom(String room_index) {
		return null;
	}

}
