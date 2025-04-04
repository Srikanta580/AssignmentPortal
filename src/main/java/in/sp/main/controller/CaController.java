package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.model.Ca;
import in.sp.main.service.FacultyService;

@RestController
@RequestMapping("/ca")
public class CaController {
    @Autowired
    private FacultyService facultyService;

    @PostMapping
    public String addCa(@RequestBody Ca ca) {
        facultyService.addCa(ca);
        return "CA added successfully";
    }

    
}
