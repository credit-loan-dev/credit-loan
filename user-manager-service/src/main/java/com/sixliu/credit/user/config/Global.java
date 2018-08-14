package com.sixliu.credit.user.config;


import com.sixliu.credit.common.codec.AesUtils;
import com.sixliu.credit.common.collect.MapUtils;
import com.sixliu.credit.common.io.PropertiesUtils;
import com.sixliu.credit.common.lang.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Global {
    public static final String FALSE = "false";
    public static final String OP_ADD = "add";
    public static final String OP_AUTH = "auth";
    public static final String USERFILES_BASE_URL = "/userfiles/";
    private static final Global INSTANCE = new Global();
    public static final String YES = "1";
    private static Logger logger = LoggerFactory.getLogger(Global.class);
    public static final String NO = "0";
    public static final String TRUE = "true";
    private static Map<String, String> props = MapUtils.newHashMap();
    public static final String SHOW = "1";
    public static final String OP_EDIT = "edit";
    public static final String HIDE = "0";

    public Global() {
    }


    public static Global getInstance() {
        return INSTANCE;
    }


    public static String getPropertyDecodeAndEncode(String ascKey, String key, String value) {
        if (value == null) {
            value = getProperty(key);
        }

        try {
            value = AesUtils.decode(value, ascKey);
            return value;
        } catch (Exception var21) {
            var21.printStackTrace();
        }
        return null;
    }

    public static String getFrontPath() {
        return getProperty("frontPath");
    }


    public static String getTablePrefix() {
        return getProperty("jdbc.tablePrefix");
    }

    public static void clearConfig() {
        PropertiesUtils.releadInstance();
        props.clear();
    }

    public static String getAdminPath() {
        return getProperty("adminPath");
    }

    public static String getProperty(String key) {
        String val = props.get(key);
        if (val == null) {
            if ((val = PropertiesUtils.getInstance().getProperty(key)) != null) {
                props.put(key, val);
                return val;
            }
        }
        return val;
    }

}
