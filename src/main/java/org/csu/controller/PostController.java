package org.csu.controller;

import org.csu.domain.Post;
import org.csu.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by bixi.lx
 * @created on 2017 11 25 22:18
 * 帖子的相关操作接口
 */
@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/list")
    public Object list() {

        //todo 按照分类查看帖子
        //todo 更高完成度，按照当前登录人的喜欢来推荐帖子，推荐相应的分类标签
        HashMap<String, Object> result = new HashMap<>();
        result.put("list", postRepository.findAll());
        result.put("count", postRepository.count());
        return result;
    }

    @PostMapping("/save")
    public Object save(Post post) {
        //todo 创建帖子或是需要积分， 或是需要管理员审核
        return postRepository.save(post);
    }

    /**
     * 根据帖子的id删除帖子
     * @param id
     * @return
     */
    @PostMapping("/delete")
    public Object delete(Long id) {
        //todo 管理员和作者才能删除帖子
        if (postRepository.exists(id)) {
            postRepository.delete(id);
        } else {
            throw new IllegalArgumentException("帖子不存在");
        }
        return successResponse();
    }

    @GetMapping("/update")
    public Object update(String theme, Long id) {
        return postRepository.modifyById(theme, id);
    }

    private Map<String, Object> successResponse() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("message", "success");
        return result;
    }
}
