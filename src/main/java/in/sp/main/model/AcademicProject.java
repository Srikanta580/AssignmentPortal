package in.sp.main.model;

import java.time.LocalDateTime;

public class AcademicProject {
    private String type;
    private LocalDateTime season;
    private LocalDateTime deadline;
    private String s_code;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getSeason() {
        return season;
    }

    public void setSeason(LocalDateTime season) {
        this.season = season;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public String getS_code() {
        return s_code;
    }

    public void setS_code(String s_code) {
        this.s_code = s_code;
    }
}
