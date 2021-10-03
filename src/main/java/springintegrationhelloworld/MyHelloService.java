package springintegrationhelloworld;

import org.springframework.context.annotation.Bean;

public class MyHelloService implements HelloService{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
