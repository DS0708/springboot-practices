package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Spring Test Integration
 */

@ExtendWith(SpringExtension.class)	//Spring환경에서 테스트 하겠다. 
@ContextConfiguration(classes=  { MyApplication.class } ) 
public class MyApplicationTest01 {
	@Autowired
	MyComponent myComponent;
	
	@Test
	public void testMyComponentNotNull() {
		assertNotNull(myComponent);
	}
	
}
