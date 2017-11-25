package org.csu.controller;

import org.csu.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return postRepository.findAll();
    }
}
