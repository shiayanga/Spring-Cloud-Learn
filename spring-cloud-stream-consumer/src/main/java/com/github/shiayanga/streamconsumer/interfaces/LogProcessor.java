package com.github.shiayanga.streamconsumer.interfaces;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface LogProcessor {
    public static String INPUT_LOG = "inputLog";
    public static String OUTPUT_LOG = "outputLog";

    @Input(INPUT_LOG)
    SubscribableChannel inputLog();

    @Output(OUTPUT_LOG)
    MessageChannel outputLog();
}
