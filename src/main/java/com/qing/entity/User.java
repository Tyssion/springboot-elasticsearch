package com.qing.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author: zhching
 * @Date: 2019/7/11 15:45
 * @Version 1.0
 */
@Data
@Document(indexName = "index_user",type = "user")
public class User {
    private String id;
    private String name;
    private int age;

}
