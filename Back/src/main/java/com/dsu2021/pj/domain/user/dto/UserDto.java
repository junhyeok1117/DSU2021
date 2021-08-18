package com.dsu2021.pj.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserDto {

    /*
        유저 회원가입 요청 DTO
     */
    @Data
    //@NoArgsConstructor
    //@AllArgsConstructor
    public static class UserSaveReq {

    }

    /**
     * 유저 정보 전달 DTO
     */
    @Data
    //@NoArgsConstructor
    //@AllArgsConstructor
    public static class UserSelectRes {
        //클라이언트한테 확인차 던지는 값

    }
    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserIdRes {
        private Long id;
    }
	
}