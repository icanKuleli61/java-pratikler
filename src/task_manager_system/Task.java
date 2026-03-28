package task_manager_system;

import java.util.Date;

public class Task implements Comparable<Task> {


    private Long taskId;

    private String taskTitle;

    private String taskDescription;

    private Long priority;

    private Date createdTime;

    public Task(Long taskId, String taskTitle, String taskDescription, Long priority, Date createdTime) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.createdTime = createdTime;
    }


    public Long getTaskId() {
        return taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public int compareTo(Task o) {
        if (this.priority < o.priority) return -1;
        if (this.priority > o.priority) return 1;
        return 0;
    }


    @Override
    public String toString() {
        return "Task\n"+ taskId + "\n" + taskTitle + "\n" + taskDescription + "\n" + priority  + "\n" + createdTime + "\n";
    }
}
