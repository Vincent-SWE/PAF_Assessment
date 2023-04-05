package ibf2022.paf.assessment.server;

import ibf2022.paf.assessment.server.models.User;

public class InsertUserException extends Exception {

    private User user;

    public InsertUserException() {
        super();
    }


    public InsertUserException(String msg) {
        super(msg);
    }



    public void setUser(User user) { this.user = user; }
    public User getUser() { return user; }


}
