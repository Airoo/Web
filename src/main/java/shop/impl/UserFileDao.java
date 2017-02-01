package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.UserDao;
import shop.models.User;

import java.util.List;

@Repository(value = "userFileDao")
public class UserFileDao extends FileAbstractDao<User> implements UserDao {

    public UserFileDao() {
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public String getDatasourceName() {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }
}
