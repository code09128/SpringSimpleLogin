package com.lei.thestation.web.controller;

import com.lei.thestation.TheStationApplication;
import com.lei.thestation.entity.User;
import com.lei.thestation.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author Admin
 * 2024/2/23 上午 11:42
 * Description:頁面登入資料抓取傳送處理
 **/
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        TheStationApplication context = new TheStationApplication();
        UserService userService = (UserService) context.getBean("userService");
        User admin = userService.login(email,password);

        //成功
        if (admin != null){
            //屬於server side呼叫
            //定義在HttpServletResponse
            //直接外部呼叫另一支程式,會顯程式名稱
            //定義在HttpServletResponse
            //效率較低(因為cilent會在request一次)
            //適用於跳至外部網站或回主畫面使用
            resp.sendRedirect("/main.jsp");
        }
        //失敗
        else{
            //屬於server side呼叫
            //定義在RequestDispatcher的介面,由request.getRequestDispatcher呼叫
            //內部轉址,URL不會顯示程式名稱(可設定成參數)
            //因是內部轉址,可以透過setAttribute傳遞參數
            //效率較高
            //適用於權限管理轉頁時使用
            req.setAttribute("message","用戶信箱或密碼錯誤");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
