<%--
  Created by IntelliJ IDEA.
  User: holid
  Date: 2023-05-23
  Time: 오후 5:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>사용자 버전 - 회원가입</title>
  <style>
    body {
      background-color: #F7F7F7;
      font-family: Arial, sans-serif;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      height: 100vh;
      margin: 0;
      padding: 0;

    }

    h1 {
      background-color: #FFFFFF;
      color: #01598B;
      padding: 20px;
      margin: 0;
      text-align: center;
      font-size:40px;
      border-radius: 10px;
    }

    form {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      margin-top: 20px;
    }

    input {
      padding: 10px;
      width: 500px;
      margin: 10px;
      border-radius: 5px;
      border: 1px solid #999999;
    }

    button {
      background-color: #29B6F6;
      border: none;
      color: #FFFFFF;
      padding: 10px 20px;
      margin: 10px;
      cursor: pointer;
      font-size: 16px;
      border-radius: 20px;
    }

    button:hover {
      background-color: #03A9F4;
    }
  </style>
</head>
<body>
<h1>회원가입 페이지</h1>

<form action="SignServlet" method="post">
  <input type="text" name="userid" placeholder="ID">
  <input type="email" name="email" placeholder="e-mail">
  <input type="text" name="phone" placeholder="전화번호">
  <input type="password" name="password" placeholder="비밀번호">
  <button type="submit" onclick="login()">로그인 혹은 회원가입</button>
</form>

<script>
  function login() {
    // 로그인 기능 수행
  }

  function newAccount() {
    // 회원가입 기능 수행
  }
</script>
</body>
</html>

