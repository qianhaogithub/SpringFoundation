package com.springexample.dao.impl;

import com.springexample.beans.Account;
import com.springexample.dao.IAccountDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author qianhao
 * @create 2020/5/16-21:55
 */
@Repository
public class AccountDaoImpl implements IAccountDao {

    private QueryRunner queryRunner;

    public void saveAccount() {

    }

    public List<Account> listAllAcount() throws SQLException {
        List<Account> query = queryRunner.query("select id,name,money from account", new BeanListHandler<Account>(Account.class));
        return query;
    }

    public Account findAccountById(Integer id) throws SQLException {
        Account query = queryRunner.query("select id,name,money from account where id=?", new BeanHandler<Account>(Account.class), id);
        return query;
    }

    public int updateAccount(Account account) throws SQLException {
        int count = queryRunner.update("update account set name=?,money=? where id=?",account.getName(),
                account.getMoney(),account.getId());
        return 0;
    }

    public int deleteAccount(Integer id) throws SQLException {
        int count = queryRunner.update("delete from account where id=?",id);
        return count;
    }
}
