package com.dsu2021.pj.domain.user.service;

import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.dto.UserResDto;
import com.dsu2021.pj.domain.user.entity.User;
import com.dsu2021.pj.domain.user.repository.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@Service
public class UserService {
    List<User> AllUsers;

    @Autowired
    private UserMapper userMapper;

    //로그인
    public ResponseEntity<UserDto> checkUser (HttpSession session, @ModelAttribute UserDto.SignIn signIn) {//1. 클라이언트의 입력값 저장
        log.info("email : {}, password = {}", signIn.getEmail(), signIn.getPassword() );//입력값 로그로 확인


//      2. 전체 user 조회
        AllUsers = getAllUsers();

//      3. 입력 값과 비교
        for(User user : AllUsers){
            if (!user.getEmail().equals(signIn.getEmail())) {
//                log.info();
                return new ResponseEntity<>(HttpStatus.OK);

            }
            session.setAttribute("email", signIn.getEmail());

        }

//      4. 일치 시 id값만 프런트에 전달(확인용)

        return null;

//        return new ResponseEntity<>(roomMapper.selectAllRooms(),HttpStatus.ACCEPTED);

    }

    //전체 user 조회
    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }







//    public ResponseEntity<?> changeDto(@RequestBody User user) {
//        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); /* 강력하게 */
//
//        UserDto userDto = mapper.map(userEntity, UserDto.class);
//    }

//    public UserDto.UserIdRes signUp (UserDto.UserSaveReq dto) {
//
//        User user = null; //repository
//
//        return UserDto.UserIdRes.builder()
//                .id(user.getEmail())
//                .build();
//    }

//    public UserDto.SignIn signIn(UserDto.SignIn dto) {
//        return UserDto.SignIn;
//    }
}
