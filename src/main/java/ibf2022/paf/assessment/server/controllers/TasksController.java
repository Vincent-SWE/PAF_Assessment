package ibf2022.paf.assessment.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ibf2022.paf.assessment.server.models.Task;
import ibf2022.paf.assessment.server.services.TodoService;
import ibf2022.paf.assessment.server.services.UserService;

// Task 4, Task 8

@Controller
@RequestMapping
public class TasksController {

    @Autowired
    UserService userSvc;

    @Autowired
    TodoService toDoSvc;




    @PostMapping(path="/task", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String postTask (@RequestBody MultiValueMap<String, String> form, Model model) {

        String username = form.getFirst("username");
        String description = form.getFirst("description-0");
        String priority = form.getFirst("priority-0");
        String dueDate = form.getFirst("dueDate-0");

        

    }





    }






    
}
