package com.yushi.service.impl;

import com.yushi.dao.AccountDao;
import com.yushi.domain.Account;
import com.yushi.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：henry
 * @date ：Created in 2019/8/2 8:22
 * @description：用户接口类实现
 * @modified By：
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAccount(){

        System.out.println("业务层findAccount方法执行了");
        return accountDao.findAccount();
    }

    @Override
    public void delAccount(Account account) {
        System.out.println("业务层delAccount方法执行了");
        accountDao.delAccount(account);
    }

    @Override
    public void addAccount(Account account) {
        System.out.println("业务层addAccount方法执行了");
        accountDao.addAccount(account);
    }
}
