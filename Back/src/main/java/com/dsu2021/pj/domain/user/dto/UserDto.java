package com.dsu2021.pj.domain.user.dto;

import lombok.*;

@Setter
@Getter
public class UserDto {

    //클라이언트 로그인 요청 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignInReq {
        private String email;
        private String password;

    }

    //DB 로그인 요청 DTO
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
        private String birthday;
        private String password;
        private Integer phoneNum;

    }

    //회원가입 요청 DTO
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUpRes {
        private String email;
        private String name;
        private String birthday;
        private String password;
        private Integer phoneNum;

    }

    //유저 정보 전달 DTO
    //클라이언트한테 확인용으로 던지는 값
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserCheckEmail {
        private String email;
    }

    /*
        유저 회원가입 요청 DTO
     */
//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public static class UserSaveReq {
//
//    }


//    @Builder
//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public static class UserIdRes {
//        private Long id;
//    }
//
//
//
//    public static class UserSignRes {
//    }
}