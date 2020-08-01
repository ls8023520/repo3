package com.lisi.service.impl;

import com.lisi.dao.ItemsDao;
import com.lisi.domain.Items;
import com.lisi.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 可爱的李四
 * @createTime: 2020/6/28 15:41
 * @version: 1.0.0
 * @place: 公司
 * @copyright: 老九学堂
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
