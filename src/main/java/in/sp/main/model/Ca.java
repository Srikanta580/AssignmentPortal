package in.sp.main.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;

@Entity
public class Ca{
   @EmbeddedId
    private CaId id;

    @Column(name = "deadline", nullable = false, updatable=false)
    private LocalDateTime deadline;
    
    @OneToMany(mappedBy = "ca", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<CaSubmission> submissions;
    @PrePersist
    protected void onCreate() {
        deadline = LocalDateTime.now();
    }
    public Ca() {
    }
    
    public Ca(CaId id, LocalDateTime deadline) {
        this.id = id;
        this.deadline = deadline;
    }
    
    public CaId getId() {
        return id;
    }
    
    public void setId(CaId id) {
        this.id = id;
    }
    
    public LocalDateTime getDeadline() {
        return deadline;
    }
    
    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public List<CaSubmission> getSubmissions() {
            return submissions;
        }
    public void setSubmissions(List<CaSubmission> submissions) {
        this.submissions = submissions;
    }
    
}
