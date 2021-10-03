package springintegrationhelloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;
import springintegrationhelloworld.HelloService;
import springintegrationhelloworld.MyHelloService;

@Configuration
public class SpringIntegrationConfig {

    @Bean(name = "helloChannel")
    public MessageChannel helloChannel() {
        return new DirectChannel();
    }

    @Bean
    public HelloService helloService() {
        return new MyHelloService();
    }

}
