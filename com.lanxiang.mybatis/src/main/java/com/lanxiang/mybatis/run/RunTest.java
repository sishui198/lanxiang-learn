package com.lanxiang.mybatis.run;

import com.lanxiang.mybatis.DAOImpl.UserDAOImpl;
import com.lanxiang.mybatis.mapper.UserMapper;
import com.lanxiang.mybatis.model.User;
import org.junit.Test;

/**
 * Created by lanxiang on 16/8/22.
 */
public class RunTest {

    private UserMapper userDAO;

    @Test
    public void testInsertUser(){
        userDAO = new UserDAOImpl();
        User user = new User();
        user.setName("兰兢");
        user.setSex(1);
        userDAO.insert(user);
    }
}
