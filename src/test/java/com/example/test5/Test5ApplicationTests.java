package com.example.test5;

import com.example.test5.entity.User;
import com.example.test5.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Test5ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    //查询
    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        //Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    //添加
    @Test
    void testInsert() {
        User user=new User();
        user.setName("测试1");
        user.setAge(1);
        user.setEmail("1.qq.com");
        int result = userMapper.insert(user);
        System.out.println("result：" + result);

        //获取自增长Id
        long userId = user.getId();
        System.out.println("userId：" + userId);
    }

    //修改
    @Test
    void testUpdate() {
        User user = userMapper.selectById(5);
        user.setName("小王");
        userMapper.updateById(user);
        System.out.println(user);
    }

    //删除
    @Test
    void testDelete() {
        userMapper.deleteById(5);
    }

}
