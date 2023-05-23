package com.example.library;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BookRegisterServlet", value = "/BookRegisterServlet")
public class BookRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 파라미터 값 얻기
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // 받은 파라미터 값 사용
        System.out.println("책 이름: " + title);
        System.out.println("저자: " + author);
        System.out.println("수량: " + quantity);

        // TODO: 받은 파라미터 값으로 필요한 작업 수행

        // 응답 설정
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>책 등록이 완료되었습니다.</h1>");
    }
}
