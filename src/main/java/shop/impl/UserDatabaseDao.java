package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.UserDao;
import shop.models.User;

@Repository(value = "userDatabaseDao")
public class UserDatabaseDao extends HibernateAbstractDao<User> implements UserDao {

    public UserDatabaseDao() {
    }


}
