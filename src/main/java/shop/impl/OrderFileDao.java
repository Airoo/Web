package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.OrderDao;
import shop.models.Order;

import java.util.List;

@Repository(value = "orderFileDao")
public class OrderFileDao extends FileAbstractDao<Order> implements OrderDao {
    public OrderFileDao() {
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public Order getById(Long id) {
        return null;
    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
