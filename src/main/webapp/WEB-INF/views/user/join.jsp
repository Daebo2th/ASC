<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
<%@ include file="../include/header.jsp"%>
</head>
<body>

	<h2>회원 가입</h2>

	<form action="${path}/user/" method="post"> 		<!-- /user/insertUser.do -->

		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name=""></td>
			</tr>
			
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			
			<tr>
				<td>이름</td>
				<td><input type="text" /></td>
			</tr>
			
			<tr>
				<td>나이</td>
				<td><input type="number" min="1" max="99" autocomplete="off"></td>
			</tr>
			
			<tr>
				<td>성별</td>
				<td><input type="radio" name="gender" value="male"> 남
				<td><input type="radio" name="gender" value="femail"> 여
				</td>
			</tr>

			<!-- <tr>
				<td>사용권한</td>
				<td>
					<select name="authority">
						<option value="ROLE_USER">일반사용자</option>
						<option value="ROLE_ADMIN">관리자</option>
					</select>
				</td> 
				</tr> -->
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="회원가입"></td>
			</tr>
		</table>
	</form>

</body>
</html>