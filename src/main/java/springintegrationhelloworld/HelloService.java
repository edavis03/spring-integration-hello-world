package springintegrationhelloworld;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public interface HelloService {
    @ServiceActivator(inputChannel = "helloChannel")
    void sayHello(String name);
}
