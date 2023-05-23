package com.example.library;

import com.example.library.user.UserDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Thread.sleep;

@WebServlet(name = "SignServlet", value = "/SignServlet")
public class SignServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 파라미터 값 얻기
        String username = request.getParameter("userid");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        response.setContentType("text/html;charset=UTF-8");

        UserDAO userDao = new UserDAO();

        // 아이디 존재 여부 확인
        if (userDao.checkUserExists(username)) {
            // 비밀번호, 이메일, 전화번호 일치 여부 확인
            if (userDao.checkCredentials(username, password, phone, email)) {
                response.getWriter().println("<script>alert('로그인 되었습니다.');</script>");
                response.getWriter().println("<script>setTimeout(function() { window.location.href = 'userMain.jsp'; }, 2000);</script>");
                Cookie cookie = new Cookie("userid", username); // userId는 쿠키에 저장할 사용자 ID 값
                cookie.setMaxAge(3600); // 쿠키의 유효기간 설정 (초 단위, 여기서는 1시간으로 설정)
                response.addCookie(cookie);
            } else {
                // 일치하지 않는 경우 로그인 오류 출력
                response.getWriter().println("<script>alert('로그인 정보가 올바르지 않습니다.');</script>");
                response.getWriter().println("<script>setTimeout(function() { window.location.href = 'UserLogin.jsp'; }, 2000);</script>");

            }
        } else {
            response.getWriter().println("<script>alert('회원가입 축하합니다.');</script>");
            userDao.registerUser(username, password, phone, email);
            response.getWriter().println("<script>setTimeout(function() { window.location.href = 'userMain.jsp'; }, 2000);</script>");
            Cookie cookie = new Cookie("userid", username); // userId는 쿠키에 저장할 사용자 ID 값
            cookie.setMaxAge(3600); // 쿠키의 유효기간 설정 (초 단위, 여기서는 1시간으로 설정)
            response.addCookie(cookie);
        }
    }
}
