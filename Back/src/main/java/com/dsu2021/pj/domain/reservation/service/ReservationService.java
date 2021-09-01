package com.dsu2021.pj.domain.reservation.service;

import com.dsu2021.pj.domain.reservation.dto.ReservationDto;
import com.dsu2021.pj.domain.reservation.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.reservation.repository.ReservationMapper;

@Service
public class ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    public void getReservationByIndex(Long index) {

    }

    //예약 요청 service
    public void reservation(Long roomIndex, ReservationDto.InsertReq insertReq, String currentSession) {

        ReservationDto.RoomReq roomReqs = reservationMapper.selectRoom(roomIndex);

        ReservationDto.UserReq userReq = reservationMapper.selectUser(currentSession);

        //체크인과 체크아웃의 시간 차이를 구하여 이용 날짜를 구함
        long date = insertReq.getCheckinDate().getTime() - insertReq.getCheckoutDate().getTime();//날짜를 숫자데이터로 변환하여 계산
        int differenceDay = (int) Math.abs(date/(24*60*60*1000));//하루

        int totalPrice = (differenceDay * roomReqs.getPrice()) + roomReqs.getCleanPrice();

        Reservation reservation = new Reservation(null, userReq.getUserIndex(), roomReqs.getRoomIndex(),
                "결제 대기", totalPrice, insertReq.getCheckinDate(), insertReq.getCheckoutDate(),
                null, insertReq.getAdult(), insertReq.getChild());


        reservationMapper.addReservation(reservation);

    }


}
