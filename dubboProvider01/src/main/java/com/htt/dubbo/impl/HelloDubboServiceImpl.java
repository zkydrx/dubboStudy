package com.htt.dubbo.impl;

import com.htt.dubbo.HelloDubboService;

/**
 * Created with IntelliJ IDEA.
 * Author: 19644
 * Date: 2018-04-15 015
 * Time: 01:00:21
 * Description:
 */
public class HelloDubboServiceImpl implements HelloDubboService
{

    @Override
    public String sayHello(String name)
    {
        return "Hello,"+name;
    }
}
