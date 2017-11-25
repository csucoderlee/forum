package org.csu.domain;

/**
 * @author by bixi.lx
 * @created on 2017 11 25 21:39
 * 帖子的领域模型
 */
public class Post {

    private Long id;

    /**
     * 帖子的主题
     */
    private String theme;

    /**
     * 帖子作者的id，关联account.id
     */
    private Long createrId;

    /**
     * 帖子作者的名字，关联accont.name
     */
    private String createrName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }
}
