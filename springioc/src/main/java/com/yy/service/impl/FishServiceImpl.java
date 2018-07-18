package com.yy.service.impl;

import com.yy.annotion.Service;
import com.yy.service.FishService;

@Service("fishServiceImpl")
public class FishServiceImpl implements FishService{
    @Override
    public String get() {
        System.out.println("get one big shark!");
        return "shark";
    }
}
