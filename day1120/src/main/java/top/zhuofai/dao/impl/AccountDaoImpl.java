package top.zhuofai.dao.impl;

import org.springframework.stereotype.Repository;
import top.zhuofai.dao.AccountDao;
import top.zhuofai.domain.Account;

import java.util.List;

/**
 * @author zhuofai
 */
//@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有用户");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存用户");
    }
}
