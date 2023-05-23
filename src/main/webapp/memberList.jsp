<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ page import="java.util.LinkedList" %>
<%@ page import="com.example.library.Dto.Member" %>
<% LinkedList<Member> memberList = (LinkedList<Member>) request.getAttribute("memberList"); %>
<html>
<head>
    <meta charset="UTF-8">
    <title>ȸ�� ���</title>
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
    <h1>ȸ�� ���</h1>
    <table>
        <thead>
            <tr>
                <th>���̵�</th>
                <th>�̸���</th>
                <th>��й�ȣ</th>
                <th>��ȭ��ȣ</th>
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