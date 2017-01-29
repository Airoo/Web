package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.RoleDao;
import shop.models.Role;

import java.util.List;

@Repository(value = "roleFileDao")
public class RoleFileDao extends FileAbstractDao<Role> implements RoleDao {
    public RoleFileDao() {
    }

    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public Role getById(Long id) {
        return null;
    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
