package shop.impl;

import shop.accessors.FileDatasourceAccessor;
import shop.models.Model;

public abstract class FileAbstractDao<T extends Model> extends FileDatasourceAccessor {

    public void remove(T model) {

    }

    public void add(T model) {

    }

    public void update(T model) {

    }

}
