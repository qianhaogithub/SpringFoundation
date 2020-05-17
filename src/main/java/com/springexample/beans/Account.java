package com.springexample.beans;

/**
 * @author qianhao
 * @create 2020/5/16-23:49
 */
public class Account {

    private Long id;
    private String name;
    private Double money;

    public Account() {
    }

    public Account(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public Account setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public Account setMoney(Double money) {
        this.money = money;
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
