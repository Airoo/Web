package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.RoleDao;
import shop.models.Role;

@Repository(value = "roleDatabaseDao")
public class RoleDatabaseDao extends HibernateAbstractDao<Role> implements RoleDao {
    public RoleDatabaseDao() {
    }
}
