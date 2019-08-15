package com.study.web;


import com.study.Service.ConsumeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.sql.SQLException;


/**
 * @author wangqianlong
 * @create 2018-11-05 10:33
 */
@RestController
public class ConsumeController {

    @Autowired
    private ConsumeService consumeService;

    @RequestMapping(value = "/hello")
    public String TestService() throws SQLException, ClassNotFoundException {
        return consumeService.hello();
    }

    @RequestMapping(value = "/ni", method = RequestMethod.GET)
    public String teda() {
        return "nihai";
    }
}
