package com.springexample.service.impl;

import com.springexample.beans.Account;
import com.springexample.dao.IAccountDao;
import com.springexample.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLException;
import java.util.List;

/**
 * @author qianhao
 * @create 2020/5/16-22:02
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountDao accountDao;

    public void saveAccount() {
        accountDao.saveAccount();
    }

    public List<Account> listAllAcount() throws SQLException {
        return accountDao.listAllAcount();
    }

    public Account findAccountById(Integer id) throws SQLException {
        return accountDao.findAccountById(id);
    }

    public int updateAccount(Account account) throws SQLException {
        return accountDao.updateAccount(account);
    }

    public int deleteAccount(Integer id) throws SQLException {
        return accountDao.deleteAccount(id);
    }

    @PostConstruct
    public void init() {
        System.out.println("service初始化了............");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("service摧毁了...............");
    }
}
