package shop.impl;

import org.springframework.stereotype.Repository;
import shop.accessors.FileDatasourceAccessor;
import shop.dao.UserDao;
import shop.models.User;

import java.util.List;

@Repository("userFileDao")
public class UserFileDao extends FileDatasourceAccessor implements UserDao {

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
    public void add(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(User model) {

    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
