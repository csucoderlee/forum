package org.csu.repository;

import org.csu.domain.Account;
import org.csu.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author by bixi.lx
 * @created on 2017 11 27 10:01
 */
public interface AccountRepository  extends JpaRepository<Account, Long> {
}
