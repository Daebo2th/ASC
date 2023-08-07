<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>login.jsp</title>
<%@ include file="../include/header.jsp" %>

<!-- 페이지 이동 하는 path 설정 -->
<script type="text/javascript">
function join(){
	location.href="${path}/user/join.do";
}
</script>

</head>
<body>
<h1>로그인 페이지</h1>

<span style="color:red;">${errMsg}</span>
<form action="${path}/user/login_check.do" method="post"> <!-- security-contex.xml 설정 할때 path 보고 작성하기  -->
	<table>
		<tr>
			<td>아이디</td>
			<td><input name=""></td>
		</tr>
			<td>비밀번호</td>
			<td><input type="password" name="">
				<!-- <input name="_spring_security_remember_me" 	type="checkbox">자동 로그인 -->
			</td>
		</tr>
			<td>
			<input type="submit" value="로그인">
			<input type="button" value="회원가입" onclick="join()">		
			</td>
	</table>
</form>

</body>
</html>