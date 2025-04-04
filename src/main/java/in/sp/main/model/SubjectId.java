package in.sp.main.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class SubjectId implements Serializable {
    private String subject_code;
    private String semester;

    public SubjectId() {
    }

    public SubjectId(String subject_code, String semester) {
        this.subject_code = subject_code;
        this.semester = semester;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectId subjectId = (SubjectId) o;
        return Objects.equals(subject_code, subjectId.subject_code) &&
               Objects.equals(semester, subjectId.semester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject_code, semester);
    }
}
