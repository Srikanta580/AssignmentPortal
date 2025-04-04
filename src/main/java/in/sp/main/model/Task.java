package in.sp.main.model;

import java.time.LocalDateTime;

public class Task {
    
    private String task;
    private LocalDateTime completation_time;
    private LocalDateTime deadline;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDateTime getCompletation_time() {
        return completation_time;
    }

    public void setCompletation_time(LocalDateTime completation_time) {
        this.completation_time = completation_time;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}
