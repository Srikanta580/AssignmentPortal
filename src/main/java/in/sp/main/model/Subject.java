package in.sp.main.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Subject {

    @EmbeddedId
    private SubjectId id;
    private String subject_name;

    public Subject(){ 
    }
    
    public Subject(SubjectId id, String subject_name) {
        this.id = id;
        this.subject_name = subject_name;
    }

    public SubjectId getId() {
        return id;
    }

    public void setId(SubjectId id) {
        this.id = id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

}
