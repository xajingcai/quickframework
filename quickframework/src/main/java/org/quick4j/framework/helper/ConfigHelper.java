package org.quick4j.framework.helper;
import java.util.Properties;

import org.quick4j.framework.ConfigConstant;
import org.quick4j.framework.util.PropsUtil;


/**
 * 属性文件助手类
 */
public final class ConfigHelper {
    private static final Properties CONFIG_PROPS =
            PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     */
    public static String getJDBCDriver()
    {
        String jdbcDriver = PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_DRIVER);
        return jdbcDriver;
    }

    /**
     *获取JDBC URL
     */
    public static String getJDBCUrl()
    {
        //TODO
        String jdbcUrl = PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_URL);
        return jdbcUrl;
    }

    /**
     * 获取数据库用户名
     * @return
     */
    public static String getJDBCUserName()
    {
        String jdbcUsrName = PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_USERNAME);
        return jdbcUsrName;
    }

    /**
     * 获取数据库登陆密码
     * @return
     */
    public static String getJDBCPassword()
    {
        String jdbcPassword = PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_PASSWORD);
        return jdbcPassword;
    }

    /**
     * 获取应用基础包名
     * @return
     */
    public static String getAppBasePackage()
    {
        String appBasePackage = PropsUtil.getString(CONFIG_PROPS,ConfigConstant.BASE_PACKAGE);
        return appBasePackage;
    }
}
