package com.dev.wiki.mapper;

import com.dev.wiki.domain.Test;

import java.util.List;

/**
 * 该路径mapper为持久层：也叫Mapper层，即Dao层
 */
public interface TestMapper {

    public List<Test> list();
}
