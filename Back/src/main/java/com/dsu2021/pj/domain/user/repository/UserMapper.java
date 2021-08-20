package com.dsu2021.pj.domain.user.repository;

import com.dsu2021.pj.domain.room.dto.RoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {

	//User 전체 조회
	ArrayList<User> getAllUsers();

	//User 추가
	User addUser(UserDto userDto);
	
	//List<Room> selectRoomsByUserIndex(UserRestDto userRestDto);
	
//	List<SearchedRoomDTO> searchRoom(SearchRoomRestDTO searchRoomRestDTO);


}
