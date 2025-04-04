package in.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.model.Faculty;
import in.sp.main.service.AdminService;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    AdminService adminService;
    @PostMapping
    public String addFaculty(@RequestBody Faculty faculty) {
        adminService.addFaculty(faculty);
        return "Faculty added successfully";
    }
    @GetMapping
    public List<Faculty> getAllFaculties() {
        return adminService.getAllFaculties();
    }
    
}
