package com.study.provide;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.dao.ProvideDao;
import com.study.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;


import java.sql.SQLException;

/**
 * @author wangqianlong
 * @create 2018-11-05 10:27
 */
@Service(group = "provide1")
//加与不加这个spring的Service注解都可以
@org.springframework.stereotype.Service
public class ProvideService implements TestService {

    @Autowired
    private ProvideDao provideDao;


    @Override
    public String SayHello() throws SQLException, ClassNotFoundException {
       /* List list = new ArrayList();

        list = provideDao.Resultdao();
        return list;*/

        return "第一个实现";
    }

}


