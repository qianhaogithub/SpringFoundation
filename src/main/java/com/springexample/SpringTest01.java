package com.springexample;

import com.springexample.dao.IAccountDao;
import com.springexample.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qianhao
 * @create 2020/5/16-21:56
 */
public class SpringTest01 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountServiceImpl");
        accountService.saveAccount();
        IAccountDao accountDao = (IAccountDao) applicationContext.getBean("accountDaoImpl");
        accountDao.saveAccount();
        applicationContext.close();
    }
}
