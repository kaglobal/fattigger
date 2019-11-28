package com.tigger.serviceprovder.controller;

import com.tigger.serviceprovder.service.api.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private CommonService commonService;

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
         * 查询表中此列值是否已存在
         * 〈〉
         * @Author: tigger
         * @Description:
         * @Date:2019/11/28 16:55

         * @return: boolean
    */
    @RequestMapping("/check")
    public boolean checkIsHave(){
        return commonService.checkExists("bsmm_user","bsmm_id","1");
    }
}
