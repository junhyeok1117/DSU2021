package com.dsu2021.pj.domain.room.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

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
		//RoomImagePath
		private ImagePath[] imagePaths;
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
		@JsonFormat(pattern = "yyyyMMdd", timezone = "Asia/Seoul")
		@DateTimeFormat(pattern="yyyyMMdd")
		private Date[] availableDates;
		//category
		private String location;
		private String kind;
		//room
		private String name;
		private Integer price;
		private Integer clean_price;
		private Integer max_person;
		private String content;
		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		public static class ImagePath{
			private int imageNumber;
			private String imagePath;
		}
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
		@DateTimeFormat(pattern="yyyyMMdd")
		private Date checkInDate;
		@DateTimeFormat(pattern="yyyyMMdd")
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
	public static class RoomAddressReq{ //주소 조회(검색) 요청 DTO
		private Long roomAddressIndex;
		private String siDo;
		private String siGunGu;
		private String eupMyeonDong;
		private String roadName;
		private String detailAddress;
	}
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomAddressRes{ //주소 조회(검색) 응답 DTO
		private Long roomAddressIndex;
		private String siDo;
		private String siGunGu;
		private String eupMyeonDong;
		private String roadName;
		private String detailAddress;
	}
	
	//////////////////////////////
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomCategoryReq{ //카테고리 조회(검색) 요청 DTO
		private Long categoryIndex;
		private String location;
		private String kind;
	}
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomCategoryRes{ //카테고리 조회(검색) 응답 DTO
		private Long categoryIndex;
		private String location;
		private String kind;
	}
	
}
