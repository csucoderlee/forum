package org.csu.service;

import org.springframework.stereotype.Service;

/**
 * @author by bixi.lx
 * @created on 2017 12 13 09:35
 */
@Service
public class AccountService {

    public boolean login() {
        throw new IllegalArgumentException("userid不能为空");
    }
}
