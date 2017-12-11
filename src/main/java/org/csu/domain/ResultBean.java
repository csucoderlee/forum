package org.csu.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @author by bixi.lx
 * @created on 2017 12 11 13:15
 */
public class ResultBean<T> implements Serializable {

    public static final int SUCCESS = 0;
    public static final int FAIL = 1;
    private static final int NO_PERMISSION = 2;

    private String msg = "success";

    private int code = SUCCESS;

    private T data;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL;
    }
}
