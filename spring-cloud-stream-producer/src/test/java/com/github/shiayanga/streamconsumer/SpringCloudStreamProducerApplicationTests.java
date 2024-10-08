package com.github.shiayanga.streamconsumer;

import com.github.shiayanga.streamconsumer.service.impl.LogMessageProducer;
import com.github.shiayanga.streamconsumer.service.impl.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringCloudStreamProducerApplicationTests {

	@Autowired
	private LogMessageProducer logMessageProducer;

	@Autowired
	private MessageProducer messageProducer;

	@Test
	public void sendMessageTest(){
		messageProducer.send("hello world");
	}

	@Test
	public void sendMessageTest2(){
		logMessageProducer.send("hello world2");
	}
}
