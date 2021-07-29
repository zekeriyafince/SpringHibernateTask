package com.zekeriyafince.SpringHibernateTask.core;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.05.2021 21:09
 */
public class DataResult<T> {

    private T data;

    public DataResult(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
