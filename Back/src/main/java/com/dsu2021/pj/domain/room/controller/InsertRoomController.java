package com.dsu2021.pj.domain.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.service.RoomService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@CrossOrigin(origins="*")
@RestController
public class InsertRoomController {
	
	@Autowired
	private RoomService service;
	
	
	@PostMapping("/rooms")
	public ResponseEntity<?> insertRoom(@RequestBody Temp temp){
		// 입력 파라미터 불일치 조정 작업
		String[] jibun = {null,null,null};
		jibun = temp.getJibunAddress().split(" ");
		
		RoomDTO.RoomHostReq req = new RoomDTO.RoomHostReq(
				jibun[0],
				jibun[1],
				jibun[2],
				temp.getRoadAddress(),
				temp.getDetailAddress(),
				null,//file,
				temp.getNumOfBed(),
				temp.getNumOfBath(),
				temp.getFacility().getTv(),
				temp.getFacility().getHairDryer(),
				temp.getFacility().getFireExtinguisher(),
				temp.getFacility().getRefrigerator(),
				temp.getFacility().getMicrowave(),
				temp.getFacility().getCookware(),
				temp.getFacility().getPark(),
				temp.getFacility().getAircon(),
				temp.getFacility().getKitchen(),
				temp.getFacility().getWifi(),
				temp.getFacility().getWashingMachine(),
				temp.getFacility().getSelfCheckIn(),
				temp.getFacility().getCommonSolo(),
				null,
				jibun[0],
				temp.getCategory(),
				temp.getRoomname(),
				temp.getBasicCost(),
				temp.getCleanUpCost(),
				temp.getHeadCount(),
				temp.getContent()
		);
		
		// 호출
		
		RoomDTO.RoomHostRes res =  service.insertRoom(req);
		
		if(res == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(res.getRoomIndex(),HttpStatus.OK);
	}
	
	
	
	
	
	//@PostMapping("/rooms")
//	public ResponseEntity<?> insertRoom(@RequestBody Temp temp){
	
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 파라미터가 안 맞아서 임시
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Temp{
		private Integer basicCost;//
		private String category;//
		private Integer cleanUpCost;//
		private String content;//
		private String detailAddress;//
		private TempFacility facility;
		private Integer headCount;//
		private String jibunAddress; //
		private Integer numOfBath;//
		private Integer numOfBed;//
		private String roadAddress;//
		private String roomname;//
		
		
		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		public static class TempFacility{//
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
			private String selfCheckIn;
			private String commonSolo;
		}
		
	}
	
	
	
	
	
	
	
	
}