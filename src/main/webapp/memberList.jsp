<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ page import="java.util.LinkedList" %>
<%@ page import="com.example.library.Dto.Member" %>
<% LinkedList<Member> memberList = (LinkedList<Member>) request.getAttribute("memberList"); %>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 목록</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            text-align: center;
            margin-bottom: 30px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            border-bottom: 1px solid #ccc;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>회원 목록</h1>
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>이메일</th>
                <th>비밀번호</th>
                <th>전화번호</th>
            </tr>
        </thead>
        <tbody>
<%
        
            for (Member member : memberList) {
        %>
        <tr>
           
            <td><%= member.getUsername() %></td>
              <td><%= member.getEmail() %></td>
             <td><%= member.getPassword() %></td>
             <td><%= member.getPhone() %></td>
       	 </tr>
        <% }%>
           
 
        </tbody>
    </table>
</body>
</html>