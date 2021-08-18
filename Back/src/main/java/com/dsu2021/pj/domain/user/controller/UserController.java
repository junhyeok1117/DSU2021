package com.dsu2021.pj.domain.user.controller;
import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import com.dsu2021.pj.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping
    ResponseEntity<User> getUserInfo(@RequestBody User user) {

        //UserForm -> 사용자에게 입력받은 데이터 dto
        //User -> DB의 엔티티
        //UserDto -> 클라이언트에 전달해주는 dto



        return new ResponseEntity("", HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<?> join(@RequestBody UserDto.UserSaveReq dto) {


        return new ResponseEntity<>(userService.user_save(dto), HttpStatus.OK);
    }
}
