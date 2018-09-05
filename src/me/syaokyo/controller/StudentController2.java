package me.syaokyo.controller;

import me.syaokyo.entity.Student;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by SyaoKyo on 2018/9/5.
 */
public class StudentController2 implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("201801010001","张三","男",18));
        list.add(new Student("201801010002","李四","女",18));
        list.add(new Student("201801010001","张三","男",18));
        list.add(new Student("201801010002","李四","女",18));
        arg0.setAttribute("list", list);
        //指定要跳转的jsp
        arg0.getRequestDispatcher("/index.jsp").forward(arg0, arg1);
    }
}
