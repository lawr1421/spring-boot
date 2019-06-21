package com.Controller;

import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:hujc
 * description:
 * date: 2019/6/20
 */
@Controller
public class TestDao {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/testDao", method = RequestMethod.POST)
    @ResponseBody
    public String testDao(){


        int a = userService.insertIntoUser();


        return String.valueOf(a);

    }




}
