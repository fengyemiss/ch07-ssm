package com.offcn.controller;

import com.offcn.domain.Student;
import com.offcn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/add.do")
    public ModelAndView add(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int nums = service.add(student);
        if(nums > 0) {
            tips = "注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/select.do")
    @ResponseBody
    public List<Student> select(){
        List<Student> list = service.select();
        return list;
    }

}
