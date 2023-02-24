package com.hero.drone.config;

import com.hero.drone.controller.HomeController;
import com.hero.drone.controller.ConfController;
import com.hero.nacos.jfinal.NacosConfig;
import com.hero.nacos.jfinal.NacosProp;
import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;


public class JfinalConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {

    }

    @Override
    public void configRoute(Routes me) {
        me.add("/", HomeController.class);
        me.add("/conf", ConfController.class);
    }

    @Override
    public void configEngine(Engine me) {

    }

    @Override
    public void configPlugin(Plugins me) {
        NacosProp prop = NacosConfig.prop("db.properties");
        String url = prop.get("db.url");
        String username = prop.get("db.username");
        String password = prop.get("db.password");
        DruidPlugin plugin = new DruidPlugin(url, username, password);
        me.add(plugin);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(plugin);
        me.add(arp);
    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
