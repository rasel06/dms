package com.rzr.dms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "view/admin/index";
    }
    
}
