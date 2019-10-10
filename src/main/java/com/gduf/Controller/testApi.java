package com.gduf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 晨边#CB
 * @Date:created in  2019/10/11 1:04
 * @Version V1.0
 **/
@Controller
public class testApi {


    @GetMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "nihaoya !!!";
    }

}
