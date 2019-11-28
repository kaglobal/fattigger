package com.tigger.serviceprovder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    /**
         *功能描述: <br>
         *     
         * 〈〉
         * @Author: tigger 
         * @Description:
         * @Date:2019/11/27 17:47
         * @Param orgId:
         * @return: java.lang.String
      **/
    @GetMapping("/")
    public String getResult(String orgId){
        return  "提供者喜喜x"+orgId;
    }
    
    /**
         *功能描述: <br>
         *     
         * 〈〉
         * @Author: tigger
         * @Date:2019/11/27 17:47
         * @Param i: 
         * @return: int
      **/
    private  int getInteger(int i){
        return i;
    }
}
