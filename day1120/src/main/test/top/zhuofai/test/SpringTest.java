package top.zhuofai.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.zhuofai.domain.Account;
import top.zhuofai.service.AccountService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringTest {
    @Autowired
    private AccountService as;
    @Test
    public void test(){
        List<Account> all = as.findAll();
        System.out.println(all);

//        Account account = new Account();
//        as.saveAccount(account);
    }
}
