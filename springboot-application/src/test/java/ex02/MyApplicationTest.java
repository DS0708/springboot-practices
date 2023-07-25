package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Error:
 * SpringBoot Test Integration(@SpringBootTest) 에서는 
 * @Configuration을 달고 있는 설정 클래스를 스캔 하지 못한다.
 */

@SpringBootTest
public class MyApplicationTest {
	@Autowired
	MyComponent myComponent;
	
	@Test
	public void testMyComponentNotNull() {
		assertNotNull(myComponent);
	}
}
