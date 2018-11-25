package top.zhuofai.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.zhuofai.domain.Items;

/**
 * @author zhuofai
 */
@Repository
public interface ItemsDao {
    /**
     * 通过name查找
     * @param name
     * @return
     */
    @Select("select * from Items where name = #{name}")
    Items findItemByName(String name);
}
