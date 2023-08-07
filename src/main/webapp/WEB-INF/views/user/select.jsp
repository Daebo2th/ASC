<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Info</title>
</head>
<body>
    <h1 align="center">내정보</h1>
    <table border="1" align="center" width="500px">
        <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>나이</th>
            <th>성별</th>
        </tr>
        <tr>
            <td>${userInfo.uid}</td>
            <td>${userInfo.uname}</td> 
            <td>${userInfo.age}</td>
            <td>${userInfo.gender}</td>
        </tr>
    </table>
</body>
</html>