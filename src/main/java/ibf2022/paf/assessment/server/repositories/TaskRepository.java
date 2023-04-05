package ibf2022.paf.assessment.server.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ibf2022.paf.assessment.server.models.Task;

// Task 6


@Repository
public class TaskRepository {


    public static final String SQL_INSERT_TASK = """
        INSERT INTO task (description, priority, due_date) VALUES (?, ?, ?)
    """;

    @Autowired
    JdbcTemplate template;

    public void insertTask(Task task) {
        template.update(SQL_INSERT_TASK, task.getTaskId(), task.getDescription(), task.getPriority(), task.getDue_date());

    }







}
