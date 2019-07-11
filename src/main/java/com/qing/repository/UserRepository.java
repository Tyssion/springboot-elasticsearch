package com.qing.repository;

import com.qing.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: zhching
 * @Date: 2019/7/11 15:43
 * @Version 1.0
 */
public interface UserRepository extends ElasticsearchRepository<User,String> {
}
