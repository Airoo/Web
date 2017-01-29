package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.ProductCategoryDao;
import shop.models.ProductCategory;

import java.util.List;

@Repository(value = "productCategoryFileDao")
public class ProductCategoryFileDao extends FileAbstractDao<ProductCategory> implements ProductCategoryDao {
    public ProductCategoryFileDao() {
    }

    @Override
    public List<ProductCategory> getAll() {
        return null;
    }

    @Override
    public ProductCategory getById(Long id) {
        return null;
    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
