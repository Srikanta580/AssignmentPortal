package in.sp.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.model.Subject;
import in.sp.main.model.SubjectId;

public interface  SubjectDao extends JpaRepository<Subject, SubjectId> {
    
}
