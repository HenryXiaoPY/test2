package com.yushi.test;

import com.yushi.dao.AccountDao;
import com.yushi.domain.Account;
import com.yushi.service.IAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

/**
 * @author ：henry
 * @date ：Created in 2019/8/2 8:29
 * @description：客户端
 * @modified By：
 */
public class client {

    @Test
    public void run1() throws Exception {
        InputStream in = Resources.getResourceAsStream("sqlMapperConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        List<Account>lists = dao.findAccount();
        for (Account account:lists){
            System.out.println(account);
        }
    }

    @Test
    public void run2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = (IAccountService)ioc.getBean("accountService");

        List<Account> accounts = accountService.findAccount();
        for (Account account:accounts){
            System.out.println(account);
        }


    }

}
