<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
<head>
  <title>ȸ������ ���� ����</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f5f5f5;
      margin: 0;
      padding: 20px;
    }
    
    h1 {
      text-align: center;
      margin-bottom: 20px;
    }
    
    .container {
      max-width: 400px;
      margin: 0 auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }
    
    .btn-container {
      text-align: center;
      margin-top: 20px;
    }
    
    .btn {
      padding: 10px 20px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      margin-right: 10px;
    }
  </style>
</head>
<body>
  <h1>ȸ������ ���� ����</h1>
  <div class="container">
    <div class="btn-container">
      <a href="insert.jsp" class="btn">ȸ������</a>
      <a href="list.do" class="btn">ȸ������</a>
    </div>
  </div>
</body>
</html>