<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateform.jsp</title>
</head>
<body>

</head>
<body>

	<h1>내 정보 수정페이지</h1>
	
	<form action="${path}/user/update.do" method="post">
		<table width="600">
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" maxlength="5" size="12"
					value="${userInfo.uname}" readonly /></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" maxlength="5" size="12"
					value="${userInfo.uid}" readonly/></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" maxlength="5" size="12" />
				</td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age" min="1" max="99" autocomplete="off"></td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
				<input type="radio" name ="gender" value="male"> 남
				<input type="radio" name ="gender" value="femail">여
				</td>
			</tr>
			<tr>
				<th></th>
				<td>
				<input type="submit" value="수정" >
			</tr>


		</table>


	</form>



</body>
</html>