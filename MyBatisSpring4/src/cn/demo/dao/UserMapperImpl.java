/*package cn.demo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import cn.demo.entity.User;
@Repository("userMapper")
public class UserMapperImpl  implements UserMapper{

	@Resource
	private SqlSessionTemplate sqlSession;
	@Override
	public List<User> getUserList() {
		return sqlSession.selectList("cn.demo.dao.UserMapper.getUserList");
	}

}
*/