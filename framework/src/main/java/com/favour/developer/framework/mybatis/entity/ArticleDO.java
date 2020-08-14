package com.favour.developer.framework.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/9
 */
@Data
@TableName("jike_article")
public class ArticleDO {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String title;

    private String article;

    private Timestamp createTime;
}
