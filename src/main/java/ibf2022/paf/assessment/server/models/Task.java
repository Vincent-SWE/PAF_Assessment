package ibf2022.paf.assessment.server.models;

import java.util.Date;

// Task 4

public class Task {

    private Integer taskId;
    private String description;
    private Integer priority;
    private Date due_date = new Date();


    public void setTaskId(Integer taskId) {this.taskId = taskId;}
	public Integer getTaskId() {return taskId;}

    public void setDescription(String description) {this.description = description; }
    public String getDescription() {return description;}
  
    public void setPriority(Integer priority) {this.priority = priority;}
    public Integer getPriority() {return priority;}
   
    public void setDue_date(Date due_date) {this.due_date = due_date;}
    public Date getDue_date() {return due_date;}
   

}
