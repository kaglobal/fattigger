package com.client.projectclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：fh
 * @Title:
 * @date ：Created in 2019/6/12 16:47
 * @最后修改人:
 * @最后修改时间：${date} ${time}
 * @description：${description}
 * @version: $version$
 * @copyright:成都信通网易医疗科技发展有限公司
 */
@FeignClient(name = "service-provider",fallback = FirstRemoteHystrix.class)
public interface FirstControllerFeign {
    @RequestMapping("/")
    public String showTime();
}
