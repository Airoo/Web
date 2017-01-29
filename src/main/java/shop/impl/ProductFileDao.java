package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.ProductDao;
import shop.models.Product;

import java.util.List;

@Repository(value = "productFileDao")
public class ProductFileDao extends FileAbstractDao<Product> implements ProductDao {
    public ProductFileDao() {
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
