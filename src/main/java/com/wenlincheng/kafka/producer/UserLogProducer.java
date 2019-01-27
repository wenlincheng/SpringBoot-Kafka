package com.wenlincheng.kafka.producer;

import com.alibaba.fastjson.JSON;
import com.wenlincheng.kafka.pojo.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * @ClassName: UserLogProducer
 * @Description: 用户日志生产者
 * @Author: Cheng
 * @Date: 2019/1/26 15:46
 * @Version: 1.0.0
 */
@Component
public class UserLogProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * @MethodName: sendLog
     * @Description: 发送数据
     * @Params: [userLog]
     * @Return: void 
     * @Author: Cheng
     * @Date: 2019/1/26 16:10
     */
    public void sendLog(UserLog userLog){
        
        System.err.println("发送用户日志数据:"+userLog);

        ListenableFuture send = kafkaTemplate.send("user-log", JSON.toJSONString(userLog));

        System.out.println(send);

    }
}
