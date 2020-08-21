package com.javaboy.stream;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(MyChannel.class)
public class MsgReceive2 {
    public final static Logger logger = LoggerFactory.getLogger(MsgReceiver.class);
    @StreamListener(MyChannel.INPUT)
    public void receive(Object payLoad)
    {
        logger.info("received2:"+payLoad);
    }
}
