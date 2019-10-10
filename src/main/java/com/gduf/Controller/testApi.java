package com.gduf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author 晨边#CB
 * @Date:created in  2019/10/11 1:04
 * @Version V1.0
 **/
@Controller
public class testApi {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "nihaoya !!!";
    }

}
