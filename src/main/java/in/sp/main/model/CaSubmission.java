package in.sp.main.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class CaSubmission {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "ca_name", referencedColumnName = "ca_name"),
        @JoinColumn(name = "subject_code", referencedColumnName = "subject_code")
    })
    private Ca ca;
    @Column(name = "student_roll", nullable = false)
    private String student_roll;
    private String submission;
    @Column(name = "submission_date", nullable = false, updatable=false)
    private LocalDateTime submission_date;
    @PrePersist
    protected void onCreate() {
        submission_date = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ca getCa() {
        return ca;
    }

    public void setCa(Ca ca) {
        this.ca = ca;
    }

    public String getStudent_roll() {
        return student_roll;
    }

    public void setStudent_roll(String student_roll) {
        this.student_roll = student_roll;
    }

    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }

    public LocalDateTime getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(LocalDateTime submission_date) {
        this.submission_date = submission_date;
    }
}
