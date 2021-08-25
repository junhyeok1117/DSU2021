package com.dsu2021.pj.domain.reservation.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ReservationMapper {

	public void getReservationByIndex(Long index);

}
