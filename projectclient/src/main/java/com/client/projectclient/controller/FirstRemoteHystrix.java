package com.client.projectclient.controller;

import org.springframework.stereotype.Component;

/**
 * @author ：fh
 * @Title:
 * @date ：Created in 2019/6/12 16:56
 * @最后修改人:
 * @最后修改时间：${date} ${time}
 * @description：${description}
 * @version: $version$
 * @copyright:成都信通网易医疗科技发展有限公司
 */
@Component
public class FirstRemoteHystrix implements FirstControllerFeign {
    @Override
    public String showTime() {
        return "提供者凉凉";
    }
}
