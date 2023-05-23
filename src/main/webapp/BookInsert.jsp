<%--
  Created by IntelliJ IDEA.
  User: holid
  Date: 2023-05-23
  Time: 오후 4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>도서 등록</title>
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

        form {
            background-color: #FFFFFF;
            padding: 20px;
            border-radius: 10px;
            margin-top: 20px;
        }

        label {
            font-weight: bold;
        }

        input[type="text"],
        input[type="number"] {
            padding: 10px;
            font-size: 16px;
            border-radius: 5px;
            border: 1px solid #ccc;
            margin-bottom: 10px;
            width: 100%;
        }

        button[type="submit"] {
            background-color: #29B6F6;
            border: none;
            color: #FFFFFF;
            padding: 10px 20px;
            cursor: pointer;
            font-size: 16px;
            border-radius: 20px;
        }

        button[type="submit"]:hover {
            background-color: #03A9F4;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>도서 등록</h1>

    <form action="BookRegisterServlet" method="post">
        <div class="form-group">
            <label for="title">책 이름:</label>
            <input type="text" id="title" name="title" required>
        </div>

        <div class="form-group">
            <label for="author">저자:</label>
            <input type="text" id="author" name="author" required>
        </div>
        <div class="form-group">
            <label for="publisher">출판사:</label>
            <input type="text" id="publisher" name="publisher" required>
        </div>
        <div class="form-group">
            <label for="book_weight">책 무게:</label>
            <input type="text" id="book_weight" name="book_weight" required>
        </div>
        <div class="form-group">
            <label for="quantity">수량:</label>
            <input type="number" id="quantity" name="quantity" min="0" required>
        </div>

        <div class="form-group">
            <button type="submit">등록</button>
        </div>
    </form>


</div>
</body>
</html>
