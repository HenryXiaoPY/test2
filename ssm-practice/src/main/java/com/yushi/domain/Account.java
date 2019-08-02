package com.yushi.domain;

import org.apache.ibatis.javassist.SerialVersionUID;

import java.io.Serializable;

/**
 * @author ：henry
 * @date ：Created in 2019/8/2 8:19
 * @description：定义用户类
 * @modified By：
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Integer salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
