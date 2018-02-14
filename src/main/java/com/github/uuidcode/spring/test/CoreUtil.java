package com.github.uuidcode.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CoreUtil {
    protected static Logger logger = LoggerFactory.getLogger(CoreUtil.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void debug(Object object) {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> debug object: {}", gson.toJson(object));
        }
    }
}
