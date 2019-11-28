package com.tigger.consoumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：fh
 * @Title:
 * @date ：Created in 2019/7/22 17:10
 * @最后修改人:
 * @最后修改时间：${date} ${time}
 * @description：${description}
 * @version: $version$
 * @copyright:成都信通网易医疗科技发展有限公司
 */
@Controller
public class IndexController {
    private static IndexController ourInstance = new IndexController();

    public static IndexController getInstance() {
        return ourInstance;
    }

    private IndexController() {
    }
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
}
