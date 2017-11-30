package org.csu.controller;

import org.csu.repository.RevertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by bixi.lx
 * @created on 2017 11 28 09:26
 */
@RestController
@RequestMapping("/revert")
public class RevertController {

    @Autowired
    private RevertRepository revertRepository;

    /**
     * 获取某个帖子下的所有回复
     * @param postId
     * @return
     */
    @GetMapping("/list")
    public Object listByPostId(Long postId) {
        return revertRepository.findOne(postId);
    }
}
