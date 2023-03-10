package com.huang.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huang.service.*;
import com.huang.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    CartService cartService;

    @Autowired
    CommodityService commodityService;

    @Autowired
    OrderMasterService orderMasterService;

    @Autowired
    UserService userService;

    @Autowired
    UserCommodityService userCommodityService;

    @Autowired
    CommodityChildService commodityChildService;

    @Autowired
    CollectionService collectionService;

    @Autowired
    CommentService commentService;

    @Autowired
    AddressService addressService;



    /**
     * 获取页面
     * @return
     */
    public Page getPage() {
        int current = ServletRequestUtils.getIntParameter(request,"current",1);
        int size = ServletRequestUtils.getIntParameter(request, "size", 10);

        return new Page(current, size);
    }


}
