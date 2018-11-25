package top.zhuofai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhuofai.dao.AccountDao;
import top.zhuofai.domain.Account;
import top.zhuofai.service.AccountService;

import java.util.List;

/**
 * @author zhuofai
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao ad;
    @Override
    public List<Account> findAll() {
        return ad.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        ad.saveAccount(account);
    }
}
