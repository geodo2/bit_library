<%--
  Created by IntelliJ IDEA.
  User: holid
  Date: 2023-05-23
  Time: 오후 7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.library.book.BookVO" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
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

        .search-container {
            display: flex;
            align-items: center;
            margin-top: 20px;
        }

        input[type="text"] {
            padding: 10px;
            margin: 0 10px;
            border-radius: 5px;
            border: 1px solid #999999;
        }

        button {
            background-color: #29B6F6;
            border: none;
            color: #FFFFFF;
            padding: 10px 20px;
            cursor: pointer;
            font-size: 16px;
            border-radius: 20px;
        }

        button:hover {
            background-color: #03A9F4;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #999999;
        }

        th {
            background-color: #E0E0E0;
        }
    </style>
</head>
<body>
<h1>도서 확인 창</h1>
<div class="search-container">
    <input type="text" placeholder="검색">
    <button onclick="search()">검색</button>
</div>

<table>
    <tr>
        <th>Book ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Publisher</th>
        <th>Quantity</th>
        <th>Is Available</th>

    </tr>
    <%
        List<BookVO> bookList= (List<BookVO>)request.getAttribute("bookList");
        for (BookVO book : bookList) { %>
    <tr>
        <td><%= book.getBookId() %></td>
        <td><%= book.getTitle() %></td>
        <td><%= book.getAuthor() %></td>
        <td><%= book.getPublisher() %></td>
        <td><%= book.getQuantity() %></td>
        <td><%= book.isAvailable() %></td>

    </tr>
    <% } %>
</table>
</body>
</html>