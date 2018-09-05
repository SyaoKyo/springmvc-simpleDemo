package me.syaokyo.controller;


import me.syaokyo.entity.Student;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


/**
 * Created by SyaoKyo on 2018/9/5.
 */
public class StudentController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
            throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("201801010001","张三","男",18));
        list.add(new Student("201801010002","李四","女",18));
        //创建ModelAndView
        ModelAndView mv = new ModelAndView();
        //相当于rquest.setAttribute()
        mv.addObject("list", list);
        //指定要跳转的jsp
        mv.setViewName("/index.jsp");
        return mv;
    }
}
