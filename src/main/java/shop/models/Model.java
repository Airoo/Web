package shop.models;

import java.io.Serializable;

public class Model implements Serializable {
    private static final long serialVersionUID = 7962959004612972403L;

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
