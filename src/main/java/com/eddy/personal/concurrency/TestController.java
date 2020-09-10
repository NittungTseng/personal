package com.eddy.personal.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

@Controller
@Slf4j
public class TestController {

    @GetMapping(value = "/test1")
    public @ResponseBody String test1(){
        Map<String,String> map = new HashMap<String,String>();

        //Lock lock = new Lock();

        log.info("欢迎进入test1方法");
        return "hello world!!!!";
    }

    public synchronized void aaa () {

    };
}
