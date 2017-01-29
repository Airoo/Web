package shop.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory  extends Model{

    private static final long serialVersionUID = 3319424443909114209L;

    private String title;

    public ProductCategory() {
        super();
    }

    public ProductCategory(Long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
