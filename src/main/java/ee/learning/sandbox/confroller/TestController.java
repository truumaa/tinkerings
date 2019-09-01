package ee.learning.sandbox.confroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        System.out.println("new request");
        return "Hello " + name + "!!";
    }

}