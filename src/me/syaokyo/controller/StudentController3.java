package me.syaokyo.controller;

import me.syaokyo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by SyaoKyo on 2018/9/5.
 */
@Controller
public class StudentController3 {

    @RequestMapping("/stus")
    public ModelAndView queryStuList(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("201801010001","张三","男",18));
        list.add(new Student("201801010002","李四","女",18));
        list.add(new Student("201801010001","张三","男",18));
        list.add(new Student("201801010002","李四","女",18));
        list.add(new Student("201801010001","张三","男",18));
        list.add(new Student("201801010002","李四","女",18));
        //创建ModelAndView
        ModelAndView mv = new ModelAndView();
        //相当于rquest.setAttribute()c
        mv.addObject("list", list);
        //指定要跳转的jsp
        mv.setViewName("/index.jsp");
        return mv;
    }
}
