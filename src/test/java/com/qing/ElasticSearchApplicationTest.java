package com.qing;

import com.qing.entity.User;
import com.qing.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * @Author: zhching
 * @Date: 2019/7/11 15:49
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ElasticSearchApplicationTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void save(){
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("zhangsan");
        user.setAge(20);

        userRepository.index(user);

    }
}
