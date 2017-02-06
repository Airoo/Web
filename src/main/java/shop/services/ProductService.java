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

    @Transactional
    public void add(Product product){
        productDao.add(product);
    }

    @Transactional
    public void update(Product product){
        productDao.update(product);
    }

    @Transactional
    public void remove(Product product){
        productDao.remove(product);
    }

    public Product getProductById(Long id){
        List<Product> products = productDao.getAll();
        for (Product product : products) {
            if(id.equals(product.getId())){
                return  product;
            }
        }
        return null;
    }
}
