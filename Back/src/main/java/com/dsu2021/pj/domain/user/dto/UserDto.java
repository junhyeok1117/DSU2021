package com.dsu2021.pj.domain.user.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
public class UserDto {

    //로그인 요청 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignInReq {
        private String email;
        private String password;
    }

    //로그인 응답 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignInRes {
        private String email;
        private String password;

    }

    //회원가입 요청 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUpReq {
        private String email;
        private String name;
//        @JsonFormat(pattern = "yyyyMMdd", timezone = "Asia/Seoul")
//        @DateTimeFormat(pattern="yyyyMMdd")
        private Date birthday;
        private String password;
        private String phone;

    }

    //회원가입 응답 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUpRes {
        private String email;
        private String name;
//        @JsonFormat(pattern = "yyyyMMdd", timezone = "Asia/Seoul")
//        @DateTimeFormat(pattern="yyyyMMdd")
        private Date birthday;
        private String password;
        private String phone;

    }

    //회원가입 시 중복을 확인하는 email 값
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DuplexEmail {
        private String email;
    }


    //유저 정보 전달 DTO
    //클라이언트한테 확인용으로 던지는 값
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserCheckEmail {
        private String email;
    }

}