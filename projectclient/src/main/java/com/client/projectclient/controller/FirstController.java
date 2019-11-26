package com.client.projectclient.controller;

import com.client.projectclient.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：fh
 * @Title:
 * @date ：Created in 2019/6/12 14:50
 * @最后修改人:
 * @最后修改时间：${date} ${time}
 * @description：${description}
 * @version: $version$
 * @copyright:成都信通网易医疗科技发展有限公司
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
