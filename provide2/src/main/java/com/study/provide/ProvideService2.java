package com.study.provide;


import com.alibaba.dubbo.config.annotation.Service;
import com.study.service.TestService;
import org.springframework.stereotype.Component;


/**
 * @author wangqianlong
 * @create 2018-11-05 10:27
 */
@Service(group = "provide2")
@Component
//@Service
public class ProvideService2 implements TestService {


    @Override
    public String SayHello() {
        return "第二个实现";
    }

}


