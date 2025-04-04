package in.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.dao.SubjectDao;
import in.sp.main.model.Subject;

@Service
public class SubjectService {
    @Autowired
    private SubjectDao subjectDao;
    public Subject addSubject(Subject subject) {
        return subjectDao.save(subject);
    }
}
