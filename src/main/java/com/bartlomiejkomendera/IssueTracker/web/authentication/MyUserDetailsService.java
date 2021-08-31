package com.bartlomiejkomendera.IssueTracker.web.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //return new User("foo","foo", new ArrayList<>());
        return userDao.findByUsername(username);
    }

    public void saveUser(User user){
        this.userDao.save(user);
    }

}
