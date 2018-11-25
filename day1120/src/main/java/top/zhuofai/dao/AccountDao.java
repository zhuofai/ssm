package top.zhuofai.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.zhuofai.domain.Account;

import java.util.List;

/**
 * @author zhuofai
 */
public interface AccountDao {
    /**
     * 查询所有账户信息
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
//    @Insert(value="insert into account (name,money) values (#{name},#{money})")
    @Insert("insert into account(name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
