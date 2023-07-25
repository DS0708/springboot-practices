package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyWebApplication {
	
//	@Controller
//	public class HelloController { //inner class controller
//		
//		@ResponseBody
//		@RequestMapping("/hello")
//		public String hello() {
//			return "hello world";
//		}
//	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ac =  SpringApplication.run(MyWebApplication.class, args);
	}
}
