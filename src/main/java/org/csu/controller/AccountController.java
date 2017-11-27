package org.csu.controller;

import org.csu.domain.Account;
import org.csu.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by bixi.lx
 * @created on 2017 11 27 10:01
 */
@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/list")
    public Object list() {
        accountRepository.findAll();
    }

    @GetMapping("/detail")
    public Object detail(Long accountId) {
        accountRepository.findOne(accountId);
    }

    @PostMapping("/save")
    public Object save(Account account) {
        return accountRepository.save(account);
    }
}
