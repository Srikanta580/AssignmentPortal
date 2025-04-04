package in.sp.main.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class CaId implements Serializable{

    private String ca_name;
    private String subject_code;
    
    public CaId() {}
    
    public CaId(String ca_name, String subject_code) {
        this.ca_name = ca_name;
        this.subject_code = subject_code;
    }


    public String getca_name() {
        return ca_name;
    }

    public void setca_name(String ca_name) {
        this.ca_name = ca_name;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaId caId = (CaId) o;
        return Objects.equals(ca_name, caId.ca_name) && Objects.equals(subject_code, caId.subject_code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ca_name, subject_code);
    }

}