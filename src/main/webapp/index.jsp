<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
<head>
    <title>Minbook 도서관</title>
    <style>
        body {
            background-color: #F2F2F2;
            font-family: Arial, sans-serif;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 40px;
            text-align: center;
            background-color: #FFFFFF;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #33475B;
            font-size: 28px;
            margin-bottom: 30px;
        }

        .logo {
            margin-bottom: 20px;
        }

        .logo img {
            width: 327px;
            height: 150px;
        }

        .btn-container {
            margin-top: 40px;
        }

        .btn-container button {
            display: inline-block;
            padding: 12px 24px;
            font-size: 16px;
            font-weight: bold;
            text-align: center;
            text-decoration: none;
            background-color: #2980B9;
            color: #FFFFFF;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .btn-container button:hover {
            background-color: #1A5276;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Minbook 도서관에 온 것을 환영합니다!</h1>
    <div class="logo">
        <a href="https://example.com">
            <img src="./img/minbok.png" alt="Minbook 로고">
        </a>
    </div>
    <div class="btn-container">
        <button onclick="location.href='adminMain.jsp'">관리자 로그인</button>
        <button onclick="location.href='UserLogin.jsp'">회원 로그인</button>
    </div>
</div>
</body>
</html>