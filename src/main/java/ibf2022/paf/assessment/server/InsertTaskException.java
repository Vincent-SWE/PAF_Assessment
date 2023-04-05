package ibf2022.paf.assessment.server;

import ibf2022.paf.assessment.server.models.Task;

public class InsertTaskException extends Exception{

    private Task task;

    public InsertTaskException() {
        super();
    }

    public InsertTaskException(String msg) {
        super(msg);
    }


    public void setTask(Task task) { this.task = task; }
    
    public Task getTask() { return task; }

  





    
}
