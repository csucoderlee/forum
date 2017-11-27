package org.csu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author by bixi.lx
 * @created on 2017 11 27 09:36
 */
@Entity
public class Revert {

    /**
     * 回复id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    /**
     * 账户id
     */
    private Long accountId;

    /**
     * 账户名字 ，冗余该字段，展现回复列表时，下方标注用户名字
     */
    private String accountName;

    /**
     * 帖子id
     */
    private Long postId;

    /**
     * 内容
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
