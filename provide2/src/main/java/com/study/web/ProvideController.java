package com.study.web;


import org.springframework.beans.factory.annotation.Autowired;


import com.study.provide.ProvideService2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqianlong
 * @create 2018-11-05 18:30
 */
@RestController
public class ProvideController {

    @Autowired
    private ProvideService2 provideService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        return provideService.SayHello();

    }
}
