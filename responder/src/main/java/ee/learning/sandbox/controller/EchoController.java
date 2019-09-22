package ee.learning.sandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo")
    public String echo(@RequestParam(value = "name", defaultValue = "Test") String name) {
        System.out.println("New echo request with name: " + name);
        return "Echo Echo " + name + "!\n";
    }
}
