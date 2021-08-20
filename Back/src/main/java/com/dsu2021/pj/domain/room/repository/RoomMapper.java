package com.dsu2021.pj.domain.room.repository;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.dsu2021.pj.domain.room.dto.FilteredRoomDTO;
import com.dsu2021.pj.domain.room.dto.ReviewStatisticDTO;
import com.dsu2021.pj.domain.room.dto.RoomImagePathDTO;
import com.dsu2021.pj.domain.room.dto.RoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.user.dto.UserDto;

@Mapper
@Repository
public interface RoomMapper {
	
	ArrayList<FilteredRoomDTO> filterRoom(SearchRoomRestDTO searchRoomRestDTO);
	
	ArrayList<FilteredRoomDTO> filterRoomWithPage(SearchRoomRestDTO searchRoomRestDTO);
	
	ArrayList<RoomImagePathDTO> searchImagesByString(String indexes);
	
	ReviewStatisticDTO getReviewStatisticByRoomIndex(String index);
	
	boolean isWishListedByRoomId();
	
	
	
	
	ArrayList<Room> selectAllRooms();
	
	Room selectRoomByRoomIndex(RoomRestDTO roomRestDTO);
	
	ArrayList<Room> selectRoomsByUserIndex(UserDto userDto);
}
