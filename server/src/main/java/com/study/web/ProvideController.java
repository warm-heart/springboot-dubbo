package com.study.web;

import com.study.provide.ProvideService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.sql.SQLException;

/**
 * @author wangqianlong
 * @create 2018-11-05 18:30
 */
@RestController
public class ProvideController {
    @Autowired
    private ProvideService provideService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String test() throws SQLException, ClassNotFoundException {
        return provideService.SayHello();
    }
}
