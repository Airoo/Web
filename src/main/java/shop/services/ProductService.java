package shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.dao.ProductDao;
import shop.models.Product;

import java.util.List;

@Service(value = "productService")
public class ProductService {

    @Autowired
    @Qualifier ("productDatabaseDao")
    private ProductDao productDao;

    public ProductService() {
    }

    @Transactional
    public List<Product> getAll(){
        return productDao.getAll();
    }
}
