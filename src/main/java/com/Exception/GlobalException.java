//package com.test.Exception;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * author:hujc
// * description:全局异常处理
// * date: 2019/6/20
// */
//@ControllerAdvice
//public class GlobalException {
//
//    @ExceptionHandler(RuntimeException.class)//捕获运行时异常
//    @ResponseBody
//    public Map<String,Object> exceptionHander(){
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("errorCode", "101");
//        map.put("errorMsg", "系統错误!");
//        return map;
//    }
//
//
//
//
//}
