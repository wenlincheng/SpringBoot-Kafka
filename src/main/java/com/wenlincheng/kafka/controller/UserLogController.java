package com.wenlincheng.kafka.controller;

import com.wenlincheng.kafka.pojo.UserLog;
import com.wenlincheng.kafka.producer.UserLogProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

/**
 * @ClassName: UserLogController
 * @Description: TODO
 * @Author: Cheng
 * @Date: 2019/1/26 16:05
 * @Version: 1.0.0
 */
@Controller
@RequestMapping("/userLog")
public class UserLogController {

    @Autowired
    private UserLogProducer kafkaSender;


    @RequestMapping("/send")
    public void send(){
        UserLog userLog = new UserLog();
        userLog.setUsername("wenlincheng");
        userLog.setUserid("123");
        userLog.setState("200");

        kafkaSender.sendLog(userLog);

    }
}
