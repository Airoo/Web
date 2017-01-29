package shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.dao.UserDao;
import shop.models.User;

import java.util.List;

@Service
public class UserService {
    @Autowired()
    @Qualifier(value = "userFileDao")
    public UserDao userDao;
    public UserService(){}

    @Transactional
    public List<User> getAll(){
        return userDao.getAll();
    }
}
