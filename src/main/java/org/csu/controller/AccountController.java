package org.csu.controller;

import org.csu.domain.Account;
import org.csu.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author by bixi.lx
 * @created on 2017 11 27 10:01
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/list")
    public Object list() {
        return accountRepository.findAll();
    }

    @GetMapping("/detail")
    public Object detail(Long accountId) {
        return accountRepository.findOne(accountId);
    }

    @PostMapping("/save")
    public Object save(Account account) {
        return accountRepository.save(account);
    }

    @PostMapping("/login")
    public Object login(Account account) {
        return accountRepository.findByUsernameAndPassword(account.getName(), account.getPassword());
    }

    //重定向的逻辑
//    @GetMapping("/url")
//    public void login(Account account, HttpServletResponse response) throws IOException {
//        response.sendRedirect("some-url");
//    }

//    /**
//     * 浏览器输入 访问地址 /account/login 直接去访问登录页面
//     * 已经放到WebMvcConfig中做了
//     * @param account
//     * @return
//     */
//    @GetMapping("/login")
//    public Object toLoginPage(Account account) {
//        return new ModelAndView("login");
//    }
}
