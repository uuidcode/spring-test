package com.github.uuidcode.spring.test;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CoreUtil {
    protected static Logger logger = LoggerFactory.getLogger(CoreUtil.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void info(Object object) {
        if (logger.isInfoEnabled()) {
            logger.info(">>> info {}", gson.toJson(object));
        }
    }

    public static void info(String title, Object object) {
        if (logger.isInfoEnabled()) {
            logger.info(">>> {} {}", title, gson.toJson(object));
        }
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }
}
