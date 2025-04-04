package in.sp.main.model;

import java.time.LocalDateTime;

public class Doubt {
    private String doubt_id; //this should be the fk of project_id+group_name from ProjectSubmission
    private String doubt;
    private LocalDateTime timestamp;

    public String getDoubt_id() {
        return doubt_id;
    }

    public void setDoubt_id(String doubt_id) {
        this.doubt_id = doubt_id;
    }

    public String getDoubt() {
        return doubt;
    }

    public void setDoubt(String doubt) {
        this.doubt = doubt;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
