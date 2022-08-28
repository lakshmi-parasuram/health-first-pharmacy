package com.hfp;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi Parasuram <lakshmibhavani1712@gmail.com>
 */
public class User {
    protected String username;
    protected String password;
    protected String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public User(){}
    public User(String username, String password, String mobile) {
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }
    public User login(String username, String password) {
        Data data = new Data();
        ArrayList<User> users = data.getUsers();
        User user = new User();
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if(u.password.equals(password) && u.username.equals(username)){
                user = u;
                break;
            }
        }
        if (user.password != null) {
            return user;  
        }
        return null;
    }
}
