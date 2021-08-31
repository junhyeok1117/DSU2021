package com.dsu2021.pj.domain.room.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Alias("roomDTO")// RoomMapper.xml에서 쓰기 위한 별명 지정
@Setter
@Getter
public class RoomDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomHostReq{ // 방 추가 요청 DTO
		//RoomAddress
		private String siDo;
		private String siGunGu;
		private String eupMyeonDong;
		private String roadName;
		private String detailAddress;
		//roomImagePath
		private MultipartFile file;
		//facility
		private Integer bed;
		private Integer bath;
		private String tv;
		private String hairDryer;
		private String fireExtinguisher;
		private String refrigerator;
		private String microwave;
		private String cookware;
		private String park;
		private String aircon;
		private String kitchen;
		private String wifi;
		private String washingMachine;
		//information
		private String selfCheckIn;
		private String commonSolo;
		//availableDate
		//@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
		//@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date[] availableDates;
		//category
		private String location;
		private String kind;
		//room
		private String name;
		private Integer price;
		private Integer cleanPrice;
		private Integer maxPerson;
		private String content;
	}
	
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomHostRes{ // 방 추가 응답 DTO
		private Long roomIndex;
	}
	
	////////////////////////
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomReq{ //방 조회(검색) 요청 DTO
		private String location="";
		private String kind="";
		private String siDo="";
		private String siGunGu="";
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date checkInDate;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date checkOutDate;
		private Integer maxPerson=0;
		
		public RoomReq(RoomDTO.RoomReq req, Date checkInDate, Date checkOutDate) {
			this.location = req.location;
			this.kind = req.kind;
			this.siDo = req.siDo;
			this.siGunGu = req.siGunGu;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.maxPerson = req.maxPerson;
		}
	}
	
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomRes{ //방 조회(검색) 응답 DTO
		private Long roomIndex;
		private Long userIndex;
		private Long addressIndex;
		private Long categoryIndex;
		private String name;
		private Integer price;
		private Integer cleanPrice;
		private Integer maxPerson;
		private String content;
	}

	//////////////////////////////

	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomInformationRes{ //방 유용한 정보 조회 응답 DTO
		private Long roomIndex;
		private String selfCheckIn;
		private String commonSolo;
	}
	
	//////////////////////////////
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomFacilityRes{ //방 시설 조회 응답 DTO
		private Long roomIndex;
		private Integer bed;
		private Integer bath;
		private String tv;
		private String hairDryer;
		private String fireExtinguisher;
		private String refrigerator;
		private String microwave;
		private String cookware;
		private String park;
		private String aircon;
		private String kitchen;
		private String wifi;
		private String washingMachine;
	}
	
	//////////////////////////////
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomImageRes{ //방 이미지 조회 응답 DTO
		private Long roomIndex;
		private int imageNumber;
		private String imagePath;
	}
	
	
	
}
