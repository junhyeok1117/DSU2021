package com.dsu2021.pj.domain.reservation.repository;

import com.dsu2021.pj.domain.reservation.dto.ReservationDto;
import com.dsu2021.pj.domain.reservation.entity.Reservation;
import com.dsu2021.pj.domain.room.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReservationMapper {

	public void getReservationByIndex(Long index);

//	public void reservation(ReservationDto.InsertReq insertReq);

	ReservationDto.RoomReq selectRoom(Long roomIndex);

}
