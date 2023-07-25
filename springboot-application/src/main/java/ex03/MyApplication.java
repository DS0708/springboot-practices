package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ex03.component.MyComponent;

@SpringBootConfiguration
@ComponentScan		//경로를 지정하지 않아도 됨. 하부스캔을 한다.
public class MyApplication {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac =  SpringApplication.run(MyApplication.class, args)){}
	}

}
