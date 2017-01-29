package shop.impl;

import shop.accessors.DatabaseDatasourceAccessor;
import shop.dao.ProductDao;
import shop.models.Product;

import java.util.List;

public class ProductDatabaseDao extends DatabaseDatasourceAccessor implements ProductDao {
    public ProductDatabaseDao() {
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
    public String getHost() {
        return null;
    }

    @Override
    public int getPort() {
        return 0;
    }
}
