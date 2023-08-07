<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>${userName}님 환영합니다</h1>
<br/>
<a href="/admin/">관리자페이지</a>
<a href="/user/select.do?uId=${userName}">사용자페이지</a>
<a href="/user/logout.do">로그아웃</a>
<a href="/user/updateform.do?uId=${userName}">정보수정</a>
<a href="/user/deleteform.do?uId=${userName}">정보삭제</a>

</body>
</html>