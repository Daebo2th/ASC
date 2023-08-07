<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateform.jsp</title>

<script type="text/javascript">
	function update() {
		location.href = "${path}/user/update.do?";
	}
	function delete() {
		location.href = "${path}/user/delete.do?";
	}
</script>
</head>
<body>

</head>
<body>

	<h1>내 정보 수정페이지</h1>

	<form action="${path}/user/" method="post">

		<table width="600">
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" maxlength="5" size="12"
					value="${}" readonly /></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="" maxlength="50" size="65"
					value="${}" readonly/></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" maxlength="12" size="13" />
				</td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age" min="1" max="99" autocomplete="off"></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><input type="radio" name ="gender" value="male"> 남
				<td><input type="radio" name ="gender" value="femail"> 여
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="수정"
					onclick="update()" /></td>
				<td colspan="2"><input type="button" value="삭제"
					onclick="delete()" /></td>
			</tr>

		</table>


	</form>



</body>
</html>