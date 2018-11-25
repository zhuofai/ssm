package top.zhuofai.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.zhuofai.dao.AccountDao;
import top.zhuofai.domain.Account;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void test(){
        InputStream in = AccountDao.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sdf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sdf.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("nihao");
        account.setMoney(800d);
        mapper.saveAccount(account);
        sqlSession.commit();
        sqlSession.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
