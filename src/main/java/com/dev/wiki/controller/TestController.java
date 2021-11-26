package com.dev.wiki.controller;

import com.dev.wiki.domain.Test;
import com.dev.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController     // @Controller(返回页面) + @ResponseBody(返回字符串或JSON对象)

public class TestController {

    @Value("${test.hello:default}")     // 通过 @Value注解 获取自定义配置项(支持默认值)
    private String testHello;

    // 引入service层
    @Resource
    private TestService testService;

    /**
     * 常见的Http请求类型：
     * GET -> 查询
     * POST -> 新增
     * PUT -> 修改
     * DELETE -> 删除
     * 传统类型：/user?id=1
     * REST方式：/user/1 配合以下几种注解：
     *
     * @return
     * @GetMapping
     * @PostMapping
     * @PutMapping
     * @DeleteMapping
     * @RequestMapping 支持所有请求方式，可通过method参数进行区分
     */
    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    // @RequestMapping("/hello")   // 定义接口对应的请求地址
    // @PostMapping("/hello")  // 只支持POST请求，提交GET请求会报405错误(type=Method Not Allowed, status=405)
    @GetMapping("/hello")   // 只支持GET请求
    public String hello() {
        return "Hello World!, " + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World, post -> " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
