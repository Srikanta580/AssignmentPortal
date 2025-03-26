package in.sp.main.model;

import java.time.LocalDateTime;

public class ContinuousAssesment {
    private int ca_name;
    private String subject_code;
    private LocalDateTime deadline;

    public int getCa_name() {
        return ca_name;
    }

    public void setCa_name(int ca_name) {
        this.ca_name = ca_name;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}
