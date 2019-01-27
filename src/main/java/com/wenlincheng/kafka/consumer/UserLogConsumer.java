package com.wenlincheng.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @ClassName: UserLogConsumer
 * @Description: 用户日志消费者
 * @Author: Cheng
 * @Date: 2019/1/26 15:47
 * @Version: 1.0.0
 */
@Component
public class UserLogConsumer {

    @KafkaListener(topics = {"user-log"})
    public void consumer(ConsumerRecord<?,?> consumerRecord){

        System.out.printf("消费： topic = %s, offset = %d, value = %s \n", consumerRecord.topic(), consumerRecord.offset(), consumerRecord.value());

        // 判断是否为null
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        if(kafkaMessage.isPresent()){
            // 得到Optional实例中的值
            Object message = kafkaMessage.get();
            System.err.println("消费消息:"+message);
        }

    }
}
