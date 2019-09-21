package ee.learning.sandbox.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "${kafka.topic.pong}", containerFactory = "pongKafkaListenerContainerFactory")
    public void greetingListener(PongKafkaMessage pongKafkaMessage) {
        System.out.println("Received pong message: " + pongKafkaMessage);
    }
}