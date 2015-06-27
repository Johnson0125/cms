package core.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.org.domain.User;
import com.org.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 

public class test {
	
//	private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		
		System.out.println(user.toString()+user.getUsername()+user.getPassword());
	}
}
