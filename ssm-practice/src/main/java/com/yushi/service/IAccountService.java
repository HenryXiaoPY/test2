package com.yushi.service;

import com.yushi.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：henry
 * @date ：Created in 2019/8/2 8:17
 * @description：定义用户接口类
 * @modified By：
 */
@Service
public interface IAccountService {

    //查询用户
    List<Account> findAccount();

    //删除用户
    void delAccount(Account account);

    //添加用户
    void addAccount(Account account);

}
