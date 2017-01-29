package shop.impl;

import org.springframework.stereotype.Repository;
import shop.accessors.FileDatasourceAccessor;
import shop.dao.ProductDao;
import shop.models.Product;

import java.util.List;

@Repository("productFileDao")
public class ProductFileDao extends FileDatasourceAccessor implements ProductDao {
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
    public void add(Product model) {

    }

    @Override
    public void update(Product model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Product model) {

    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
