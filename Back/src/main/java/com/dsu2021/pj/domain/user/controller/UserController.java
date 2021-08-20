package com.dsu2021.pj.domain.user.controller;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.dto.UserResDto;
import com.dsu2021.pj.domain.user.entity.User;
import com.dsu2021.pj.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

//    회원가입
//    @PostMapping("/signUp")



    //로그인 요청
    @GetMapping("/signIn")
    public ResponseEntity<UserDto> signIn (HttpSession session, UserDto.SignIn signIn){
        return userService.checkUser(session, signIn);
    }


//    @PostMapping
//    ResponseEntity<UserDto> join(@RequestBody UserDto.UserSaveReq dto) {
//
//        return new ResponseEntity<UserDto>(userService.signUp(dto), HttpStatus.OK);
//    }

//    @GetMapping
//    ResponseEntity<User> getUserInfo(@RequestBody User user) {
//
//        //UserForm -> 사용자에게 입력받은 데이터 dto
//        //User -> DB의 엔티티
//        //UserDto -> 클라이언트에 전달해주는 dto
//
//
//
//        return new ResponseEntity("", HttpStatus.OK);
//    }
//
//    @PostMapping
//    ResponseEntity<?> join(@RequestBody UserDto.UserSaveReq dto) {
//
//
//        return new ResponseEntity<>(userService.user_save(dto), HttpStatus.OK);
//    }
}
