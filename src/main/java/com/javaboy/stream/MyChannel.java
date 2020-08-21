package com.javaboy.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MyChannel {
    String INPUT="javaboy-input";
    String OUT="javaboy-out";
    @Output(OUT)
    MessageChannel output();
    @Input(INPUT)
    SubscribableChannel input();
}
