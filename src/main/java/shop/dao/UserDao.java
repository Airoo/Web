package shop.dao;

import shop.models.User;

public interface UserDao extends ItemDao<User>{
    public User getByUsername(String username);
}
