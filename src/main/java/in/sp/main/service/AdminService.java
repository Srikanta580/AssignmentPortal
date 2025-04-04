package in.sp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.dao.FacultyDao;
import in.sp.main.dao.StudentDao;
import in.sp.main.model.Faculty;
import in.sp.main.model.Student;

@Service
public class AdminService {
    //Student operations
     @Autowired
    StudentDao studentDao;
    public Student addStudent(Student student) {
        return studentDao.save(student);
    }
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }
    //Faculty operations
     @Autowired
    FacultyDao facultyDao;
    public Faculty addFaculty(Faculty faculty) {
        return facultyDao.save(faculty);
    }
    public List<Faculty> getAllFaculties() {
        return facultyDao.findAll();
    }
}