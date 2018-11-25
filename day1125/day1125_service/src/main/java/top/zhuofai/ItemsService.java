package top.zhuofai;

import top.zhuofai.domain.Items;

/**
 * @author zhuofai
 */
public interface ItemsService {
    /**
     *
     * @param name
     * @return
     */
    public Items findItemByName(String name);
}
