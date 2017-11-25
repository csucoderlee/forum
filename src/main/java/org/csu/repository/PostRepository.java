package org.csu.repository;

import org.csu.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * @author by bixi.lx
 * @created on 2017 11 25 22:50
 */
public interface PostRepository extends JpaRepository<Post, Long>{

    @Transactional
    @Modifying
    @Query(value = "update Post p set p.theme = ?1 where p.id = ?2")
    int modifyById(String  theme, Long id);
}
