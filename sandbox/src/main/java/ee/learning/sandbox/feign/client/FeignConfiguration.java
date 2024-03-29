package ee.learning.sandbox.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class FeignConfiguration {

    @Autowired
    private ResponderClient responderClient;

    public String echo() {
        return responderClient.echo();
    }
}
