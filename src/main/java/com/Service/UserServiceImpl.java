package com.Service;

import com.Mapper.UserMapper;
import com.Pojo.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * author:hujc
 * description:
 * date: 2019/6/20
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

//    private  Logger log = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public int insertIntoUser() {
        User user = new User();
        user.setUsername("hu");
        user.setAge(20);
        int a = userMapper.insertIntoUser(user);

//        if (a == 1){
//            log.info("asdasd");
//        }
        return a;
    }
}
