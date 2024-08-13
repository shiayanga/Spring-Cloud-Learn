package com.github.shiayanga.streamconsumer.service;

import com.github.shiayanga.streamconsumer.interfaces.LogProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

@EnableBinding(LogProcessor.class)
public class LogService {

    @StreamListener(LogProcessor.INPUT_LOG)
    public void receiveLog(Message<String> log) {
        System.out.println("Received log: " + log.getPayload());
    }
}
