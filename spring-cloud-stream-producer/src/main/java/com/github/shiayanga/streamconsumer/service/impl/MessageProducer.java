package com.github.shiayanga.streamconsumer.service.impl;

import com.github.shiayanga.streamconsumer.service.IMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(Source.class)
public class MessageProducer implements IMessageProducer {
    @Autowired
    private Source source;
    @Override
    public void send(String message) {
        source.output().send(MessageBuilder.withPayload(message).build());
    }
}
