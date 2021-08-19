package com.dsu2021.pj.domain.room.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dsu2021.pj.domain.room.dto.RoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.room.entity.Room;

@Mapper
@Repository
public interface RoomMapper {
	
	Room selectRoomByRoomIndex(RoomRestDTO roomRestDTO);
	
	//List<Room> selectRoomsByUserIndex(UserRestDto userRestDto);
	
	List<SearchedRoomDTO> searchRoom(SearchRoomRestDTO searchRoomRestDTO);

	List<Room> selectAllRooms();
}
