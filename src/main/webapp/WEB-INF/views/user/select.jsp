<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Info</title>
</head>
<body>
    <h1>User Info</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>age</th>
            <th>gender</th>
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