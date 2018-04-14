package com.htt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Author: 19644
 * Date: 2018-04-15 015
 * Time: 01:45:01
 * Description:
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext
                ("classpath:applicationConetxt.xml");
        classPathXmlApplicationContext.start();
        System.in.read();
    }
}
