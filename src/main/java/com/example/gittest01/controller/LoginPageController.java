package com.example.gittest01.controller;

import com.example.gittest01.pojo.PojoStudent;
import com.example.gittest01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginPage")
public class LoginPageController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/findStudentByStudentId")
    public PojoStudent FindStudentByStudentId(@RequestParam String id)
    {
        System.out.println("id:"+id);
        return studentService.findStudentByStudentId(id);
    }
}
