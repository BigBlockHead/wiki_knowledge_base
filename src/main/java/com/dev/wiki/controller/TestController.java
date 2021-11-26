package com.dev.wiki.controller;

import org.springframework.web.bind.annotation.*;

@RestController     // @Controller(返回页面) + @ResponseBody(返回字符串或JSON对象)

public class TestController {

    /**
     * 常见的Http请求类型：
     *  GET -> 查询
     *  POST -> 新增
     *  PUT -> 修改
     *  DELETE -> 删除
     *  传统类型：/user?id=1
     *  REST方式：/user/1 配合以下几种注解：
     *      @GetMapping
     *      @PostMapping
     *      @PutMapping
     *      @DeleteMapping
     *  @RequestMapping 支持所有请求方式，可通过method参数进行区分
     * @return
     */
    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    // @RequestMapping("/hello")   // 定义接口对应的请求地址
    // @PostMapping("/hello")  // 只支持POST请求，提交GET请求会报405错误(type=Method Not Allowed, status=405)
    @GetMapping("/hello")   // 只支持GET请求
    public String hello() {
        return "Hello World!";
    }
}