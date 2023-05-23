<%@ page import="com.example.library.book.BookVO" %><%--
  Created by IntelliJ IDEA.
  User: holid
  Date: 2023-05-23
  Time: 오후 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>도서수량수정</title>
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

    .input-container {
      display: flex;
      flex-direction: column;
      align-items: center;
      margin-top: 20px;
    }

    .input-container label {
      margin-bottom: 10px;
    }

    .input-container input {
      padding: 10px;
      margin-bottom: 10px;
      width: 300px;
    }

    .input-container input[type="number"] {
      width: 50px;
    }

    button {
      background-color: #01598B;
      border: none;
      color: #FFFFFF;
      padding: 10px 20px;
      margin-top: 10px;
      cursor: pointer;
      font-size: 16px;
      border-radius: 20px;
    }

    button:hover {
      background-color: #013766;
    }
  </style>
</head>
<body>
<h1>도서수량수정</h1>

<div class="input-container">
  <label for="book-name">도서명:</label>
  <input type="text" id="book-name" placeholder="도서명" value="Java 프로그래밍">

  <label for="author">저자:</label>
  <input type="text" id="author" placeholder="저자" value="이웅모">

  <label for="publisher">출판사:</label>
  <input type="text" id="publisher" placeholder="출판사" value="위키북스">

  <label for="weight">무게:</label>
  <input type="text" id="weight" placeholder="무게" value="2kg">

  <label for="quantity">수량:</label>
  <input type="number" id="quantity" placeholder="수량" value="3">

  <button onclick="updateQuantity()">수량 수정</button>
</div>

<script>
  function updateQuantity() {
    // 도서 수량 수정 작업 수행
  }
</script>
</body>
</html>

