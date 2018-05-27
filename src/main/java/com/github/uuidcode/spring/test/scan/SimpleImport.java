package com.github.uuidcode.spring.test.scan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import com.github.uuidcode.spring.test.CoreUtil;

public class SimpleImport implements ImportBeanDefinitionRegistrar {
    protected static Logger logger = LoggerFactory.getLogger(SimpleImport.class);

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(SimpleScan.class.getName()));

        if (logger.isDebugEnabled()) {
            logger.debug(">>> registerBeanDefinitions annotationAttributes: {}", CoreUtil.toJson(annotationAttributes));
        }
    }
}
