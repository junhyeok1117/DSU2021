package com.dsu2021.pj.domain.room.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dsu2021.pj.domain.room.dto.RoomRestDTO;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.user.dto.UserRestDTO;

@Mapper
@Repository
public interface RoomMapper {
	
	List<Room> selectAllRooms();
	
	Room selectRoomByRoomIndex(RoomRestDTO roomRestDTO);
	
	List<Room> selectRoomsByUserIndex(UserRestDTO userRestDTO);
}
