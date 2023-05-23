<!DOCTYPE html>
<html>
<head>
  <title>도서 관리 - 관리자 도서 등록 페이지</title>
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

    btn {
      padding: 10px 20px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      margin-right: 10px;
    }

    button:hover {
      background-color: #013766;
    }
  </style>
</head>
<body>
<h1>도서 관리 - 관리자 도서 등록 페이지</h1>

<div class="button-container">
  <button onclick="location.href='BookInsert.jsp'">도서 등록</button>
  <button onclick="goToQuantityModification()">도서 수량 수정</button>
  <button onclick="goToBookDeletion()">도서 삭제</button>
  <button onclick="location.href='BookListServlet'">전체 출력</button>
</div>


<script>

</script>
</body>
</html>
