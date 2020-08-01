package com.lisi.controller;

import com.lisi.domain.Items;
import com.lisi.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 可爱的李四
 * @createTime: 2020/6/28 22:02
 * @version: 1.0.0
 * @place: 公司
 * @copyright: 老九学堂
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model) {
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "itemsDetail";
    }
}
