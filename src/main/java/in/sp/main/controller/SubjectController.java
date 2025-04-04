package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.model.Subject;
import in.sp.main.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @PostMapping
    public String addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);
        return "Subject added successfully";
    }
}
