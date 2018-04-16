package com.htt.dubbo.service.impl;

import com.htt.dubbo.service.HelloDubboService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Author: 19644
 * Date: 2018-04-15
 * Time: 01:00:21
 * Description:
 */
@Service("helloDubboService")
public class HelloDubboServiceImpl implements HelloDubboService
{

    @Override
    public String sayHello(String name)
    {
        return "Hello,"+name+" version1.0.0";
    }
}
