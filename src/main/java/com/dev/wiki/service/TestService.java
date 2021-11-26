package com.dev.wiki.service;

import com.dev.wiki.domain.Test;
import com.dev.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 在Service类中添加Service注解，将其交由Spring管理
 */
@Service
public class TestService {

    // 增加@Resource注解，将TestMapper注入成员变量
    // @Resource 为JDK自带注解， @AutoWired 为spring注解
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }

}
