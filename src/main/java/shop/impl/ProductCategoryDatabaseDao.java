package shop.impl;

import org.springframework.stereotype.Repository;
import shop.dao.ProductCategoryDao;
import shop.models.ProductCategory;

@Repository(value = "productCategoryDatabaseDao")
public class ProductCategoryDatabaseDao extends HibernateAbstractDao<ProductCategory> implements ProductCategoryDao {
    public ProductCategoryDatabaseDao() {
    }
}
