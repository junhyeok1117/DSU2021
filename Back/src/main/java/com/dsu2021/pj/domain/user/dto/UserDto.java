package com.dsu2021.pj.domain.user.dto;

import lombok.*;

@Setter
@Getter
public class UserDto {


    //로그인 요청 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignIn {
        private String email;
        private String password;

    }

    //회원가입 요청 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUp {
        private String email;
        private String name;
        private String birthday;
        private String password;
        private Integer phoneNum;

    }

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
        //클라이언트한테 확인용으로 던지는 값

    }
    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserIdRes {
        private Long id;
    }
	
}