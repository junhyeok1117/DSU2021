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

@Alias("roomDTO")// RoomMapper.xml에서 쓰기 위한 별명 지정
@Setter
@Getter
public class RoomDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomHostReq{
		//RoomAddress
		private String siDo;
		private String siGunGu;
		private String eupMyeonDong;
		private String roadName;
		private String detailAddress;
		//RoomImagePath
		private Image_path image_path;
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
		private Date[] date;
		//category
		private String location;
		private String kind;
		//room
	}
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Image_path{
		private int imageNumber;
		private String imagePath;
	}
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomReq{
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
	public static class RoomRes{
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

	
	
	
}
