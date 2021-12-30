package com.jie.dao;

import com.jie.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-11 01:06
 **/
public class UserMapperImp2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
