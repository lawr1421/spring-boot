package com.Controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * author:hujc
 * description:
 * date: 2019/6/20
 */
@Controller
@EnableAutoConfiguration
public class TestController {


    @RequestMapping(value = "/test")
    @ResponseBody
    public String testController(){

        return "hello";
    }


    @RequestMapping(value = "/testParam/{name}/{age}")
    @ResponseBody
    public String testWithParam(@PathVariable String name,@PathVariable String age){



        return "testWithParam " + name + " " + age;
    }




}
