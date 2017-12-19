package org.csu.repository;

import org.csu.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author by bixi.lx
 * @created on 2017 11 27 10:01
 */
public interface AccountRepository  extends JpaRepository<Account, Long> {
    @Query(value = "select name from Account a where name = ?1 and password = ?2")
    Account findByUsernameAndPassword(String name, String password);
}
