package org.csu.domain;

/**
 * @author by bixi.lx
 * @created on 2017 11 25 21:59
 * 用户的领域模型
 */
public class Account {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
