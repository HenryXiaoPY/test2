package com.yushi.dao;


import com.yushi.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：henry
 * @date ：Created in 2019/8/2 8:17
 * @description：定义用户接口类
 * @modified By：
 */

@Repository
public interface AccountDao {

    //查询用户
    @Select("select * from user_info")
    List<Account> findAccount();

    //删除用户
    @Delete("delete from user_info where id=#{id}")
    void delAccount(Account account);

    //添加用户
    @Insert("insert into user_info values(#{id},#{name},#{salary})")
    void addAccount(Account account);
}
