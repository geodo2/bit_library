<%--
  Created by IntelliJ IDEA.
  User: holid
  Date: 2023-05-24
  Time: ���� 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
<head>
  <title>���� ���� - ������ ���� ��� ������</title>
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

    .button-container {
      display: flex;
      justify-content: center;
      margin-top: 20px;
    }

    button {
      background-color: #01598B;
      border: none;
      color: #FFFFFF;
      padding: 10px 20px;
      margin: 10px;
      cursor: pointer;
      font-size: 16px;
      border-radius: 20px;
    }


    button:hover {
      background-color: #013766;
    }
    .logo {
      margin-bottom: 100px;
    }

    .logo img {
      width: 237px;
      height: 150px;
    }
  </style>
</head>
<body>
<div class="logo">
  <a href="https://example.com">
    <img src="./img/minbok.png" alt="Minbook �ΰ�">
  </a>
</div>

<h1>���� ���� - ������ ���� ��� ������</h1>

<div class="button-container">
  <button onclick="location.href='BookInsert.jsp'">���� ���</button>
  <button onclick="location.href='UpdatepageServlet'">���� ����</button>
  <button onclick="location.href='BookDeleteServlet'">���� ����</button>
  <button onclick="location.href='BookListServlet'">��ü ���</button>
</div>


<script>

</script>
</body>
</html>

