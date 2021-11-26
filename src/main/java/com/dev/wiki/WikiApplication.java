package com.dev.wiki;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


/**
 * WikiApplication能扫描到 cotroller包下的TestController的原因：
 *  包含@ComponentScan注解，可扫描当前路径下所有子包
 *  也支持扫描指定路径下的包：
 *
 */
// @ComponentScan("com.dev")   // 扫描指定路径下的包
// @ComponentScan({"com.dev", "com.test"})   // 扫描多个路径下的包
@SpringBootApplication
@MapperScan("com.dev.wiki.mapper")
public class WikiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(WikiApplication.class, args);
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！");
        LOG.info("地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
