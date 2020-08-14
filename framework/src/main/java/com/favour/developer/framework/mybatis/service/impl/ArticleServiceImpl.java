package com.favour.developer.framework.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.favour.developer.framework.mybatis.entity.ArticleDO;
import com.favour.developer.framework.mybatis.mapper.ArticleMapper;
import com.favour.developer.framework.mybatis.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/25
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleDO> implements ArticleService {

}
