package com.study.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDaoProvide {
    @Autowired
    private ProvideDao provideDao;

    @Test
    public void resultdao() throws SQLException, ClassNotFoundException {
       List list= provideDao.Resultdao();
       for (int i=0;i<list.size();i++){
           System.out.println(list.get(i));
        }
    }
}