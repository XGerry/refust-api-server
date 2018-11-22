package com.spread.api.controller;

import com.spread.api.service.JpushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Gerry
 * @description:
 * @date: Created in 2018/11/21
 */
@RestController
@RequestMapping("/jpush")
public class JPushController {
    @Autowired
    JpushService jpushService;

    @RequestMapping(method = RequestMethod.GET, value = "/send")
    public String sendMessage() {
        String title = "推送标题测试";
        String content = "推送内容测试";
        Map<String, String> extrasMap = new HashMap<>();
        //此Map必须创建和实例化，但可以不添加内容
        extrasMap.put("test", "https://community.jiguang.cn/push");
        //方式一：服务端控制推送内容方式
        jpushService.sendPush(title, content, extrasMap, "");
        return "Hello";
    }
}

