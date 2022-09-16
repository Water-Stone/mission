package com.example.mission;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("getWifi")
public class getWifi extends HttpServlet {

    //초기화
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init 메소드 호출");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String cmd = request.getParameter("command");

        if(cmd.equals("wifi")){
            response.sendRedirect("wifiList.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
//        request.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html; charset=\"UTF-8\"");
//
//        PrintWriter out = response.getWriter();
//
//        String id = request.getParameter("user_id");
//        String pw = request.getParameter("user_pw");
//        String add = request.getParameter("user_address");
//
//        System.out.println("아이디: " + id);
//        System.out.println("비밀번호: " + pw);
//
//        String data = "<html>";
//        data += "<body>";
//        data += "아이디: " + id;
//        data += "<br>";
//        data += "패스워드: " + pw;
//        data += "<br>";
//        data += "주소: " + add;
//        data += "</body>";
//        data += "</html>";
//
//        out.print(data);
    }

    public void destroy() {
        System.out.println("destroy 메소드 호출");
    }

}
