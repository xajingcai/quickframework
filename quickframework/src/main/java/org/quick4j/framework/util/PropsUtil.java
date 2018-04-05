package org.quick4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件加载工具类，用于加载具体的properties类文件
 */
public class PropsUtil {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     *
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName) {
        Properties props = null;
        InputStream inputStream = null;
        try {
            //获取当前线程下的属性文件
            inputStream = Thread.currentThread().getContextClassLoader().
                    getResourceAsStream(fileName);
            if (inputStream == null) {
                throw new FileNotFoundException(fileName + "File is not found!");
            }
        } catch (IOException e) {
            LOGGER.error("load properties file failure", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure", e);
                }
            }
        }
        return props;
    }

    /**
     * 获取字符型属性
     */
    public static String getString(Properties props, String key) {
        String res = getString(props, key);
        return res;
    }

    /**
     * 获取数值型属性
     */
    public static int getInt(Properties props, String key) {
        int value = 0;
        if (props.containsKey(key)) {
            value = Integer.getInteger(props.getProperty(key));
        }
        return value;
    }
}
