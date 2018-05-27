package com.github.uuidcode.spring.test.scan;

import java.util.Map;

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
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {
        String className = SimpleScan.class.getName();
        Map<String, Object> map = annotationMetadata.getAnnotationAttributes(className);
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(map);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> registerBeanDefinitions annotationAttributes: {}",
                CoreUtil.toJson(annotationAttributes));
        }
    }
}
