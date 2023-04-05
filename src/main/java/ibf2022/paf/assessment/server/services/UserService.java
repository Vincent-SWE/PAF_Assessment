package ibf2022.paf.assessment.server.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ibf2022.paf.assessment.server.InsertUserException;
import ibf2022.paf.assessment.server.models.User;
import ibf2022.paf.assessment.server.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;

    @Transactional(rollbackFor = InsertUserException.class)
    public void insertUser(User user) throws InsertUserException {

        String userId = UUID.randomUUID().toString().substring(0, 8);
        
        user.setUserId(userId);
        user.setUsername(user.getUsername());
        user.setName(user.getName());


        try {
            userRepo.insertUser(user);
        } 
        catch (Exception ex) {
            throw new InsertUserException(ex.getMessage());
        }


    }











}





