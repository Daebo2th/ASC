package com.kosa.dao;

import java.util.List;
import java.util.Map;

import com.kosa.dto.UserInfoDTO;

public interface UserDAO {
	// 회원가입
	public void join(Map<String, Object> map);
	// 회원 수정
	public void updatePwd(Map<String, String> map);
	public void updateInfo(UserInfoDTO dto);
	// 회원 삭제
	public void delete(String uId);
	// 로그인
	public void login(String uId);
	// 회원 조회
	public UserInfoDTO selectById(String uId);

	List<UserInfoDTO> selectAll();
}
