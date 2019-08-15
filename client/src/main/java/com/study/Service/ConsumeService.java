package com.study.Service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.study.service.TestService;

import org.springframework.stereotype.Service;

import java.sql.SQLException;


/**
 * @author wangqianlong
 * @create 2018-11-05 11:18
 */
@Service
public class ConsumeService {

    @Reference(group = "provide2")
    private TestService testService;

    public String hello() throws SQLException, ClassNotFoundException {
        return testService.SayHello();
    }

}
