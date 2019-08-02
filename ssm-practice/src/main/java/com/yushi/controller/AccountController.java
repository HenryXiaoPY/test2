package com.yushi.controller;

import com.yushi.domain.Account;
import com.yushi.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：xiaolong
 * @date ：Created in 2019/8/2 7:51
 * @description：表现层访问service层
 * @modified By：
 */

@Controller
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    //查询所有账户
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层findAll方法执行了");
        List<Account> accounts = accountService.findAccount();
        for (Account account:accounts){
            System.out.println(account);
        }
        model.addAttribute("list",accounts);
        return "success";
    }

    //删除账户
    @RequestMapping("/delAccount")
    public String delAccount(){
        Account account = new Account();
        account.setId(1);
        System.out.println("表现层delAccount方法执行了");
        accountService.delAccount(account);
        return "success";
    }

    //添加账户
    @RequestMapping("/addAccount")
    public String addAccount(Integer id,String name,Integer salary){
        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setSalary(salary);
        System.out.println("表现层addAccount方法执行了");
        accountService.addAccount(account);
        return "success";
    }

}
