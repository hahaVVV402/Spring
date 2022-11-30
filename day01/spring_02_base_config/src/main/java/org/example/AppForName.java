package org.example;

import org.example.service.BookService;
import org.example.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
//        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
//        bookDao.save();


        BookService bookService = (BookService) ctx.getBean("service");
        bookService.save();



    }
}
