package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.OrderDao;
import shop.models.Order;

@Repository(value = "orderDatabaseDao")
public class OrderDatabaseDao extends HibernateAbstractDao<Order> implements OrderDao {
    public OrderDatabaseDao() {
    }
}
