package cn.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.demo.dao.UserMapper;
import cn.demo.entity.User;
@Service("userService")
@Scope("singleton")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public List<User> getUserList(){
		return userMapper.getUserList();
	}
	
	/*@Override
	public Integer addUser(User user) {
		Integer result = userMapper.addUser(user);
		int i = 1/0;
		return result;
	}*/
}
