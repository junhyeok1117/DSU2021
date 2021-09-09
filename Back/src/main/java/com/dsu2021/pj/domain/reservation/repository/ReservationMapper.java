package com.dsu2021.pj.domain.reservation.repository;

import com.dsu2021.pj.domain.reservation.dto.ReservationDto;
import com.dsu2021.pj.domain.reservation.entity.Reservation;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReservationMapper {

	public void getReservationByIndex(Long index);

//	public void reservation(ReservationDto.InsertReq insertReq);

	//room의 정보 추출
	Room selectRoom(Long roomIndex);

	//user의 정보 추출
	User selectUser(String currentSession);

	//예약 등록
	void addReservation(Reservation reservation);

}
