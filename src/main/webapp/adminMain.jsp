<%--
  Created by IntelliJ IDEA.
  User: holid
  Date: 2023-05-23
  Time: 오후 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>도서관리 프로그램 - 관리자 버전</title>
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
      border-radius: 10px;
    }

    img {
      display: block;
      margin: 20px auto;
      max-width: 300px;
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

    input[type="text"] {
      padding: 10px;
      font-size: 16px;
      border-radius: 5px;
      border: 1px solid #ccc;
    }

    .result {
      margin-top: 20px;
      font-size: 18px;
      font-weight: bold;
    }
  </style>
</head>
<body>
<h1>도서관리 프로그램 - 관리자 버전</h1>

<div>
  <label for="adminKey">관리자 키:</label>
  <input type="text" id="adminKey" placeholder="관리자 키를 입력하세요">
  <button onclick="showAdminKey()">입력</button>
</div>

<div class="result" id="result"></div>

<script>
  function showAdminKey() {
    var adminKey = document.getElementById("adminKey").value;
    if (adminKey === "bitbit31") {
      window.location.href = "admin.jsp";
    } else {
      document.getElementById("result").innerText = "올바른 관리자 키를 입력하세요.";
    }
  }
</script>
</body>
</html>
