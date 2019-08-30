package cn.demo.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import cn.demo.entity.User;
import cn.demo.service.UserService;

public class UserTest {
	/*
	@Test
	public void testAddUserList() {
		String resource = "applicationContext-mybatis.xml";
		ApplicationContext context =
				new ClassPathXmlApplicationContext(resource);
		UserService userService =
				(UserService)context.getBean("userService");
		
		System.out.println(result);
	}*/
	
	
	
	
	@Test
	public void testGetUserList() {
		String resource = "applicationContext-mybatis.xml";
		ApplicationContext context =
				new ClassPathXmlApplicationContext(resource);
		UserService userService =
				(UserService)context.getBean("userService");
		List<User> userList =
				userService.getUserList();
		System.out.println(userList.size());
	}
}
