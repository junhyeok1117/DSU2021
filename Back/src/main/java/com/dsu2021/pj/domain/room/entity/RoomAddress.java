package com.dsu2021.pj.domain.room.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoomAddress {
	private Long roomAddressIndex;
	private String siDo;
	private String siGunGu;
	private String eupMyeonDong;
	private String roadName;
	private String detailAddress;
}
