<%--
  Created by IntelliJ IDEA.
  User: KOSA
  Date: 2023-08-07
  Time: 오후 4:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${userName}님 환영합니다.</title>
</head>
<body>
<h1 align="center">회원리스트</h1>
<table border="1" align="center" width="500px">
    <thead>
    <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>나이</th>
        <th>성별</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list">
        <tr>
            <td><a href="/user/updateform.do?uId=${list.uid}">${list.uid}</a></td>
            <td>${list.uname}</td>
            <td>${list.age}</td>
            <td>${list.gender}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
