package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * author:hujc
 * description:
 * date: 2019/6/20
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.Controller","com.Service","com.Util","com.Exception"})
@MapperScan(basePackages = {"com.Mapper"})
public class AppLaunch {

    public static void main(String[] args){

        SpringApplication.run(AppLaunch.class,args);
    }

}
