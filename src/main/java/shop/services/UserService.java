package shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.dao.UserDao;
import shop.models.User;

import java.util.List;

@Service(value = "userService")
public class UserService implements UserDetailsService {
    @Autowired()
    @Qualifier(value = "userDatabaseDao")
    public UserDao userDao;

    public UserService() {
    }

    @Transactional
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> USERNAME: " + username);
        User user = userDao.getByUsername(username);
        //System.err.println(">>>>>>>>>>>>>>>>>>>>>>>> USERNAME FROM DB: " + user.toString());
        if (user == null) {
            throw new UsernameNotFoundException("User with username: " + username + " not found!");
        }
        return user;
    }
}
