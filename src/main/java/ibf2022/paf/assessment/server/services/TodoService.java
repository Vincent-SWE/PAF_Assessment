package ibf2022.paf.assessment.server.services;

// import java.sql.PreparedStatement;
// import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.dao.DataAccessException;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ibf2022.paf.assessment.server.InsertTaskException;
import ibf2022.paf.assessment.server.models.Task;
import ibf2022.paf.assessment.server.models.User;
import ibf2022.paf.assessment.server.repositories.TaskRepository;
import ibf2022.paf.assessment.server.repositories.UserRepository;

// Task 7

@Service
public class TodoService {


    public static final String SQL_INSERT_USER = """
		INSERT INTO user (user_id, username, name) VALUES (?, ?, ?)
			""";


    @Autowired
    private UserRepository userRepo;

    @Autowired
    private TaskRepository taskRepo;


    public boolean userExists(String username) {
        return userRepo.findUserByUsername(username).isPresent();
    }



    @Transactional(rollbackFor = InsertTaskException.class)
    public void upsertTask(Task task, User user) throws InsertTaskException {

        boolean bUserExist =  userExists(user.getUsername());
        
        if (bUserExist = false) {
            userRepo.createUser(user);
        }
        taskRepo.insertTask(task);

    }



 





}
