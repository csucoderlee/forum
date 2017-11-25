package org.csu.repository;

import org.csu.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author by bixi.lx
 * @created on 2017 11 25 22:50
 */
public interface PostRepository extends JpaRepository<Post, Long>{
}
