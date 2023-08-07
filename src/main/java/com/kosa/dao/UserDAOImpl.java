package com.kosa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosa.dto.UserInfoDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void join(Map<String, Object> map) {
		sqlSession.insert("user.insertUser", map);
		sqlSession.insert("user.insertInfo", map);
	}

	@Override
	public void updatePwd(Map<String, String> map) {
		sqlSession.update("user.updatePwd", map);
	}
	
	@Override
	public void updateInfo(UserInfoDTO dto) {
		sqlSession.update("user.updateInfo", dto);
	}
	
	@Override
	public void delete(String uId) {
		sqlSession.delete("user.deleteUser", uId);
	}

	@Override
	public void login(String uId) {
		
	}
	@Override
	public UserInfoDTO selectById(String uId) {
		return sqlSession.selectOne("user.selectByIdInfo", uId);
	}

	@Override
	public List<UserInfoDTO> selectAll() {
		return sqlSession.selectList("user.selectAll");
	}

}
