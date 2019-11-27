package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：fh
 * @Title:
 * @date ：Created in 2019/6/12 15:38
 * @最后修改人:
 * @最后修改时间：${date} ${time}
 * @description：${description}
 * @version: $version$
 * @copyright:成都信通网易医疗科技发展有限公司
 */
@RestController
public class TestController {
    @GetMapping("/")
    public String getResult(){
        return  "提供者喜喜";
    }
}
