package com.tigger.consoumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：fh
 * @Title:
 * @date ：Created in 2019/6/12 14:50
 * @最后修改人:
 * @最后修改时间：${date} ${time}
 * @description：${description}
 * @version: $version$
 */
@RestController
public class FirstController {
    @Autowired
    private  FirstControllerFeign firstControllerFeign;
/*    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/")
    public String showTime(){
       return restTemplate.getForObject("http://service-provider/",String.class);
    }*/
    @GetMapping ("/toserver")
    public String showTime(){
        return firstControllerFeign.showTime();
    }
}
