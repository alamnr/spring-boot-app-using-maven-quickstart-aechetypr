package com.spring.kevin.boot;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan()
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(App.class, args);
        BookService service = context.getBean(BookService.class);
        System.out.println(service.saveBook(new Book(null,"ghuddi",30,new Date())));
    }
}
