package in.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.model.Student;
import in.sp.main.service.AdminService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
     AdminService adminService;
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        adminService.addStudent(student);
        return "Student added successfully";
    }
    @GetMapping
    public List<Student> getAllStudents() {
        return adminService.getAllStudents();
    }
        
}
