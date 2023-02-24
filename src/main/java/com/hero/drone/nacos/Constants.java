package com.hero.drone.nacos;


import com.hero.nacos.jfinal.NacosProp;

public class Constants {

    private static NacosProp prop;

    static {
        prop = com.hero.nacos.jfinal.NacosConfig.prop("config.properties", p -> Constants.prop = p);
    }

    public static String getWxAppId() {
        return prop.get("wx.appid", "");
    }

    public static String getWxMchId() {
        return prop.get("wx.mchid", "");
    }

    public static String getWxApiKey() {
        return prop.get("wx.apikey", "");
    }
}
