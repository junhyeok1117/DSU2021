package com.dsu2021.pj.domain.room.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.dsu2021.pj.domain.host.repository.HostMapper;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.dto.TestDTO;
import com.dsu2021.pj.domain.room.entity.UnAvailableDate;
import com.dsu2021.pj.domain.room.entity.Category;
import com.dsu2021.pj.domain.room.entity.Facility;
import com.dsu2021.pj.domain.room.entity.Information;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.room.entity.RoomAddress;
import com.dsu2021.pj.domain.room.repository.RoomMapper;
import com.dsu2021.pj.domain.room.service.RoomService;

@Service
public class RoomService{
	
	//READ
	
	@Autowired
	private RoomMapper roomMapper;
	@Autowired
	private HostMapper hostMapper;
	
	public List<RoomDTO.RoomRes> search15Rooms(Integer page, RoomDTO.RoomReq req) throws Exception{
		Integer index = ( page - 1 ) * 15;

		List<RoomDTO.RoomRes> rooms;
		
		if(req.getCheckInDate() == null || req.getCheckOutDate() == null) { // 시간 입력 없을 때
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
				req = new RoomDTO.RoomReq(req,sdf.parse("0000.01.01 00:00:00"),sdf.parse("0000.01.01 00:00:00"));
				
				rooms = roomMapper.search15Rooms(index, req);
				return rooms;
			} catch (ParseException e) {
				// 일어날리 없는 에러
			}
		}
		
		Long differenceTime = req.getCheckInDate().getTime() - req.getCheckOutDate().getTime();
		int differenceDay = (int) Math.abs(differenceTime/(24*60*60*1000));
		
		if( differenceTime >= 0 || differenceDay < 1)
			throw new Exception(); // 임시로 에러 발생
		
		Date dateForCheckOut = new Date(req.getCheckOutDate().getTime() - (1000*60*60*24)  );
		req = new RoomDTO.RoomReq(req, req.getCheckInDate(), dateForCheckOut);
		
		rooms = roomMapper.search15Rooms(index,req);
		
		return rooms;
	}
	
	public RoomDTO.RoomRes getRoomByIndex(Long roomIndex){
		RoomDTO.RoomRes room = roomMapper.getRoomByIndex(roomIndex);
		return room;
	}
	
	public List<RoomDTO.RoomRes> get15RoomsByPage(Integer page){ // 안 쓰임
		Integer index = ( page - 1 ) * 15;
		List<RoomDTO.RoomRes> rooms = roomMapper.get15RoomsFromIndex(index);
		return rooms;
	}
	
	public Date[] getUnAvailableDatesByRoomIndex(Long roomIndex) {
		
		Date[] dates = roomMapper.getUnAvailableDatesByRoomIndex(roomIndex);
		
		return dates;
	}
	
	public RoomDTO.RoomInformationRes getInformationByRoomIndex(Long roomIndex){
		return roomMapper.getInformationByRoomIndex(roomIndex);
	}
	
	public RoomDTO.RoomFacilityRes getFacilityByRoomIndex(Long roomIndex){
		return roomMapper.getFacilityByRoomIndex(roomIndex);
	}
	
	public RoomDTO.RoomFacilityRes getImagesByRoomIndex(Long roomIndex){
		return roomMapper.getFacilityByRoomIndex(roomIndex);
	}
	
	public RoomDTO.RoomAddressRes getAddressByRoomAddressIndex(Long roomAddressIndex){
		return roomMapper.getAddressByRoomAddressIndex(roomAddressIndex);
	}
	
	public RoomDTO.RoomCategoryRes getCategoryByCategoryIndex(Long categoryIndex){
		return roomMapper.getCategoryByCategoryIndex(categoryIndex);
	}
	
//	public TestDTO[] test(Date a,Date b) {
//		return roomMapper.test(a,b);
//	}
//	
//	public void tet(TestDTO sss) {
//		roomMapper.tesst(sss);
//	}
	
	//CREATE
	
	@Transactional
	public RoomDTO.RoomHostRes insertRoom(RoomDTO.RoomHostReq req){ // facility, information 값 검증 추가 필요
		
		RoomAddress addressInfo = new RoomAddress(null,req.getSiDo(),req.getSiGunGu(),req.getEupMyeonDong(),req.getRoadName(),req.getDetailAddress());
		Long addressIndex = roomMapper.getRoomAddressIndex(addressInfo);
		if(addressIndex == null) {
			roomMapper.insertAddress(addressInfo);
			addressIndex = roomMapper.getRoomAddressIndex(addressInfo);
		}
		
		Category categoryInfo = new Category(null,req.getLocation(),req.getKind());
		Long categoryIndex = roomMapper.getRoomCategoryIndex(categoryInfo);
		if(categoryIndex == null) {
			roomMapper.insertCategory(categoryInfo);
			categoryIndex = roomMapper.getRoomCategoryIndex(categoryInfo);
		}
		
		Long userIndex = 10l;// 로그인 구현되면 그에 맞게 index가져오도록 수정 필요
		if(hostMapper.getHostByUserIndex(userIndex) == null)
			hostMapper.addHost(userIndex);
		
		Room roomInfo = new Room(null,userIndex,addressIndex,categoryIndex,req.getName(),req.getPrice(),req.getCleanPrice(),req.getMaxPerson(),req.getContent());

		roomMapper.insertRoom(roomInfo);
		Long roomIndex = roomMapper.getLatestRoomIndex(roomInfo);
		
		
//		MultipartFile file = req.getFile();
//		if(file != null && !file.isEmpty()) {
//			//이미지 경로 DB에 저장하는 로직 작성할 것
//		}
		
		roomMapper.insertFacility(new Facility(roomIndex,req.getBed(),req.getBath(),req.getTv(),req.getHairDryer(),req.getFireExtinguisher(),req.getRefrigerator(),req.getMicrowave(),req.getCookware(),req.getPark(),req.getAircon(),req.getKitchen(),req.getWifi(),req.getWashingMachine()));
		roomMapper.insertInformation(new Information(roomIndex,req.getSelfCheckIn(),req.getCommonSolo()));
		
		if(req.getUnAvailableDates() != null)
		for(int i = 0 ; i < req.getUnAvailableDates().length ; i++) {
			roomMapper.insertUnAvailableDate( new UnAvailableDate(roomIndex,req.getUnAvailableDates()[i] ));
		}
		
//		System.out.println(req.getFile());//이미지 저장 로직 작성할 것
		
		return new RoomDTO.RoomHostRes(roomIndex);
	}
	
	
	public RoomDTO.RoomImageRes insertImages(Long roomIndex,MultipartFile file){
		
		String fileName = file.getOriginalFilename();
		String path = roomIndex+"/"+fileName;
		
		System.out.println(file.getOriginalFilename());
		System.out.println(path);
		
		return null;
	}

//	public Long insertUnavailableDate(Long roomIndex, Date[] unavailableDate) {
//		if(unavailableDate != null) 
//			for(Date date : unavailableDate)
//				//roomMapper.insertUnavailableDate(new UnAvailableDate(roomIndex,date));
//		return roomIndex;
//	}
	
	//UPDATE
	
	
	//DELETE
	
}
