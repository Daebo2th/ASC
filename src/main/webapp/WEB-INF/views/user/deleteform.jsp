<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deleteform.jsp</title>

</head>
<body>
	<h1>삭제 페이지</h1>

	<h3>${userInfo.uid}님의정보를 삭제하시겠습니까 ? 비밀 번호를 다시 한번 입력하세요</h3>

	<form action="${path}/user/delete.do?uId=${userInfo.uid}" method="post">
	
	<table width="400">
		<tr>
			<th>아이디</th>
			<td><input type="text" name="id" value="${userInfo.uid}" readonly/></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td> <input type="password" name="pwd" /> </td>
		</tr>
	</table>
	
	<input type="submit" value="삭제" >	
</form>


</body>
</html>