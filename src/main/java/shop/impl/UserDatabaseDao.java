package shop.impl;

import shop.accessors.DatabaseDatasourceAccessor;
import shop.dao.UserDao;
import shop.models.User;

import java.util.List;

public class UserDatabaseDao extends DatabaseDatasourceAccessor implements UserDao{

    public UserDatabaseDao() {
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
    public String getHost() {
        return null;
    }

    @Override
    public int getPort() {
        return 0;
    }
}
