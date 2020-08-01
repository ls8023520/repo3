package com.lisi.dao;

import com.lisi.domain.Items;

/**
 * @description:
 * @author: 可爱的李四
 * @createTime: 2020/6/28 15:16
 * @version: 1.0.0
 * @place: 公司
 * @copyright: 老九学堂
 */
public interface ItemsDao {

    public Items findById(Integer id);
}
