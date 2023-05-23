package com.example.library;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignServlet", value = "/SignServlet")
public class SignServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 파라미터 값 얻기
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        // 받은 파라미터 값 사용
        System.out.println("사용자 아이디: " + username);
        System.out.println("비밀번호: " + password);
        System.out.println("이메일: " + email);
        System.out.println("전화번호: " + phone);

        // TODO: 받은 파라미터 값으로 필요한 작업 수행

        // 응답 설정
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>가입이 완료되었습니다.</h1>");
    }
}
