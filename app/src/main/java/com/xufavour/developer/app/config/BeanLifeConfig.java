package com.xufavour.developer.app.config;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: xuyangyang
 * @Date: 2020/7/6
 */
@Configuration
public class BeanLifeConfig implements BeanNameAware, BeanClassLoaderAware,BeanPostProcessor {


    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware -- " + name);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor -- postProcessBeforeInitialization -- " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor -- postProcessAfterInitialization -- " + beanName);
        return null;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("BeanClassLoaderAware -- " + classLoader.toString());
    }
}
