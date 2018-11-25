package top.zhuofai.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zhuofai.ItemsService;
import top.zhuofai.dao.ItemsDao;
import top.zhuofai.domain.Items;


/**
 * @author zhuofai
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao dao;

    @Override
    public Items findItemByName(String name){
        return dao.findItemByName(name);
    }
}
