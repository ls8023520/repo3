package com.lisi.test;

import com.lisi.dao.ItemsDao;
import com.lisi.domain.Items;
import com.lisi.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: 可爱的李四
 * @createTime: 2020/6/28 15:29
 * @version: 1.0.0
 * @place: 公司
 * @copyright: 老九学堂
 */
public class ItemsTest {

    @Test
    public void findById() {
        // 获取Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //// dao测试
        //// 从容器中拿到所需的dao的代理对象
        //ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //// 调用方法
        //Items items = itemsDao.findById(1);
        //System.out.println(items.getName());

        // service测试
        ItemsService itemsService = ac.getBean(ItemsService.class);
        // 调用方法
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
