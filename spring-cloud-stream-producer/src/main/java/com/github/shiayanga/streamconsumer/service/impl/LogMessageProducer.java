package com.github.shiayanga.streamconsumer.service.impl;

import com.github.shiayanga.streamconsumer.interfaces.LogProcessor;
import com.github.shiayanga.streamconsumer.service.IMessageProducer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

@EnableBinding(LogProcessor.class)
public class LogMessageProducer implements IMessageProducer {
    @Resource
    private LogProcessor logProcessor;

    @Override
    public void send(String message) {
        logProcessor.outputLog().send(MessageBuilder.withPayload(message).build());
    }
}
