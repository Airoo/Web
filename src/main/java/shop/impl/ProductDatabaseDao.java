package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.ProductDao;
import shop.models.Product;

@Repository(value = "productDatabaseDao")
public class ProductDatabaseDao extends HibernateAbstractDao<Product> implements ProductDao {
    public ProductDatabaseDao() {
    }
}
