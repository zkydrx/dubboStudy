package com.htt.dubbo.service.impl;

import com.htt.dubbo.service.HelloDubboService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-16
 * Time: 21:25:01
 * Description:
 */
@Service("helloDubboService1")
public class HelloDubboServiceImpl1 implements HelloDubboService
{

    @Override
    public String sayHello(String name)
    {
        return "Hello,"+name+" version2.0.0";
    }
}
