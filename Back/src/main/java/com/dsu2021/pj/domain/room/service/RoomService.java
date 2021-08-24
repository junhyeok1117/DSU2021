package com.dsu2021.pj.domain.room.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.repository.RoomMapper;
import com.dsu2021.pj.domain.room.service.RoomService;

@Service
public class RoomService{
	
	@Autowired
	private RoomMapper roomMapper;
	
	public List<RoomDTO.RoomRes> search15Rooms(Integer page, RoomDTO.RoomReq req){
		Integer index = ( page - 1 ) * 15;
		
		List<RoomDTO.RoomRes> rooms;
		
		if(req.getCheckInDate() == null || req.getCheckOutDate() == null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
				req = new RoomDTO.RoomReq(req,sdf.parse("0000.01.01"),sdf.parse("9999.12.31"));
				rooms = roomMapper.search15Rooms(index, req, 0);
				System.out.println(req);
				System.out.println(sdf.parse("0000.01.01"));
				System.out.println(sdf.parse("9999.12.31"));
				return rooms;
			} catch (ParseException e) {
				// 일어날리 없는 에러
			}
		}
		
		Long differenceTime = req.getCheckInDate().getTime() - req.getCheckOutDate().getTime();
		int differenceDay = (int) Math.abs(differenceTime/(24*60*60*1000));
		
		rooms = roomMapper.search15Rooms(index,req,differenceDay);
		
		
		return rooms;
	}
	
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex){
		RoomDTO.RoomRes room = roomMapper.getRoomByIndex(roomIndex);
		return room;
	}
	
	
	
	
	
	
	public List<RoomDTO.RoomRes> get15RoomsByPage(Integer page){
		Integer index = ( page - 1 ) * 15;
		List<RoomDTO.RoomRes> rooms = roomMapper.get15RoomsByIndex(index);
		return rooms;
	}
}
