package ee.learning.sandbox.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, PongKafkaMessage> pongKafkaTemplate;

    @Value(value = "${kafka.topic.pong}")
    private String pongTopicName;

    public void sendGreetingMessage(PongKafkaMessage pongKafkaMessage) {
        pongKafkaTemplate.send(pongTopicName, pongKafkaMessage);
    }
}