package ee.learning.sandbox.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "ResponderApplication")
public interface ResponderClient {

    @GetMapping(path = "/echo")
    @ResponseBody
    String echo();
}
