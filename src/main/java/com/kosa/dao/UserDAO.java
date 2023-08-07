package com.kosa.dao;

import com.kosa.dto.UserDTO;

public interface UserDAO {
	// 회원가입
	public void join(UserDTO dto);
	// 회원 수정
	public void update(UserDTO dto);
	// 회원 삭제
	public void delete(String uId);
	// 로그인
	public void login(String uId);
}
