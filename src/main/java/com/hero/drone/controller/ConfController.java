package com.hero.drone.controller;


import com.hero.drone.nacos.Constants;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfController extends Controller {


    public void pay() {
        Map<String, String> result = new HashMap<>(4);
        result.put("appId", Constants.getWxAppId());
        result.put("mchId", Constants.getWxMchId());
        result.put("apiKey", Constants.getWxApiKey());
        renderJson(result);
    }

    public void mysql() {
        List<Record> records = Db.use().find("select * from users");
        renderJson(records);
    }

}
