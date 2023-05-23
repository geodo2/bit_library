<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >

<html>
<head>
  <title>ȸ�� ����</title>
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
    
    label {
      display: block;
      margin-bottom: 10px;
    }
    
    input[type="text"],
    input[type="password"],
    input[type="email"],
    input[type="tel"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
      margin-bottom: 20px;
    }
    
    .btn-container {
      text-align: center;
    }
    
    .btn {
      padding: 10px 20px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    
    .btn-cancel {
      background-color: #ccc;
      margin-right: 10px;
    }
  </style>
</head>
<body>
  <h1>ȸ�� ����</h1>
  <div class="container">
    <form action="SignServlet" method="post">
      <label for="username">���̵�:</label>
      <input type="text" id="username" name="username" required>
      
      <label for="password">��й�ȣ:</label>
      <input type="password" id="password" name="password" required>
      
      <label for="email">�̸���:</label>
      <input type="email" id="email" name="email" required>
      
      <label for="phone">��ȭ��ȣ:</label>
      <input type="tel" id="phone" name="phone" required>
      
      <div class="btn-container">
        <input type="submit" class="btn" value="����">
        <input type="button" class="btn btn-cancel" value="���">
      </div>
    </form>
  </div>
</body>
</html>