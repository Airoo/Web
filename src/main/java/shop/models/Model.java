package shop.models;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class Model implements Serializable {
    private static final long serialVersionUID = 7962959004612972403L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private  Long id;

    public Model() {
    }

    public Model(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
