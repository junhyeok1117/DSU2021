package com.dsu2021.pj.domain.reservation.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class ReservationDto {

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class InsertReq{//사용자가 입력해야하는 값
		private Date checkinDate;
		private Date checkoutDate;
		private Integer adult;
		private Integer child;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomReq{//숙소에 대한 필요한 값
		private Long roomIndex;
		private Integer price;
		private Integer cleanPrice;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class UserReq{//사용자에 대한 필요한 값
		private Long userIndex;
		private String email;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CheckDate{//front에 보낼 체크인, 체크아웃 날짜
		private Date checkinDate;
		private Date checkoutDate;
	}



//	@Data
//	@NoArgsConstructor
//	@AllArgsConstructor
//	public static class ReservationRes{
//		private Long reservationindex;
//		private Long userIndex;
//		private Long roomIndex;
//		private String reservationState;
//		private int reservationPrice;
//		private Date checkinDate;
//		private Date checkoutDate;
//		private Date reservationDate;
//	}
	
	
}
