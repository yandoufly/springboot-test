package com.yjy.postProcessor.v1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("对容器进行处理后。。。。。");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}