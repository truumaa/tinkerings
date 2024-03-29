package ee.learning.sandbox.confroller;

import ee.learning.sandbox.feign.client.FeignConfiguration;
import ee.learning.sandbox.kafka.MessageProducer;
import ee.learning.sandbox.kafka.PongKafkaMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MessageProducer messageProducer;
    @Autowired
    private FeignConfiguration feignConfiguration;

    @GetMapping("/test/kafka")
    public String testKafka(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        System.out.println("New Ping: " + name);
        messageProducer.sendGreetingMessage(new PongKafkaMessage("New Ping-Pong message", name));
        return "Hello " + name + "!\n";
    }

    @GetMapping("/test/echo")
    public String testEcho(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        System.out.println("New Echo request: " + name);
        return feignConfiguration.echo();
    }

}