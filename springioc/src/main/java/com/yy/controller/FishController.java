package com.yy.controller;


import com.yy.annotion.Controller;
import com.yy.annotion.Qualifier;
import com.yy.annotion.RequestMapping;
import com.yy.service.FishService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller(value = "fish")
public class FishController {

    @Qualifier("fishServiceImpl")
    FishService fishService;

    //响应请求的方法
    @RequestMapping("get")
    public String getFish(HttpServletRequest req , HttpServletResponse rsp, String param){
        return fishService.get();
    }
}
