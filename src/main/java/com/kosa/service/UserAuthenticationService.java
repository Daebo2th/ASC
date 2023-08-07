package com.kosa.service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.kosa.dto.UserDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//로그인 처리 클래스
@Service
public class UserAuthenticationService implements UserDetailsService {

    private SqlSessionTemplate sqlSession;
    public UserAuthenticationService() { 	}

    public UserAuthenticationService(
            SqlSessionTemplate sqlSession) {
        this.sqlSession=sqlSession;
    }


    @Override
    public UserDetails loadUserByUsername(String uId)
            throws UsernameNotFoundException {
        System.out.println("왜안돼");
        //사용자 아이디 확인
        Map<String, Object> user = sqlSession.selectOne("user.selectUser", uId);

        //아이디가 없으면 예외 발생
        if (user == null) throw new UsernameNotFoundException(uId);

        //사용권한 목록
        List<GrantedAuthority> authority = new ArrayList<>();
        authority.add(new SimpleGrantedAuthority(user.get("ROLE").toString())); //필드명은 대문자로
        return new UserDTO(user.get("U_ID").toString(),
                user.get("PWD").toString(),
                true,
                true, true, true, authority
        );

    }

}











