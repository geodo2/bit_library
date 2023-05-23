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
    </style>
</head>
<body>
<h1>���� ���� - ������ ���� ��� ������</h1>

<div class="button-container">
    <button onclick="location.href='BookInsert.jsp'">���� ���</button>
    <button onclick="location.href='UpdatepageServlet'">���� ���� ����</button>
    <button onclick="location.href='BookDeleteServlet'">���� ����</button>
    <button onclick="location.href='BookListServlet'">��ü ���</button>
</div>


<script>

</script>
</body>
</html>
