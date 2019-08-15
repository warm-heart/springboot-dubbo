package com.study.provide;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProvideServiceTest {
    @Autowired
    private ProvideService provideService;

    @Test
    public void sayHello() throws SQLException, ClassNotFoundException {
       /* List list=provideService.SayHello();
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }*/
    }
}