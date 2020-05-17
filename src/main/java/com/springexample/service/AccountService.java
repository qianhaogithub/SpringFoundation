package com.springexample.service;

import com.springexample.beans.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * @author qianhao
 * @create 2020/5/16-21:56
 */
public interface AccountService {

    void saveAccount();

    List<Account> listAllAcount() throws SQLException;

    Account findAccountById(Integer id) throws SQLException;

    int updateAccount(Account account) throws SQLException;

    int deleteAccount(Integer id) throws SQLException;
}
