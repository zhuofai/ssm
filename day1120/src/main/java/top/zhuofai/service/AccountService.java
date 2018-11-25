package top.zhuofai.service;

import org.springframework.stereotype.Repository;
import top.zhuofai.domain.Account;

import java.util.List;

/**
 * @author zhuofai
 */
public interface AccountService {
    /**
     * 查询所有账户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    void saveAccount(Account account);
}
