package springintegrationhelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIntegrationHelloWorldApplication implements ApplicationRunner {
	@Autowired
	HelloService helloService;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationHelloWorldApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		helloService.sayHello("World");
	}
}
