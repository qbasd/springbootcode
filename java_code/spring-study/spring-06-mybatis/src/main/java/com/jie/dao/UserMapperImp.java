package com.jie.dao;

import com.jie.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-10 19:56
 **/
public class UserMapperImp implements UserMapper{
    private SqlSessionTemplate sqlSession;
    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
}
