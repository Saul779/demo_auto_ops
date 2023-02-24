package com.hero.drone.controller;

import com.jfinal.core.Controller;


public class HomeController extends Controller {

    public void index() {
        renderJson("hello drone");
    }
}
