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
    
    
//    @RequestMapping("/rasel")
//	public String home(
//	    @RequestParam(value = "emailsubject") String emailSubject,
//	    @RequestParam(value = "emailaddress") String emailAddress1,
//	    @RequestParam(value = "emailaddress") String emailAddress2) {
//	    return "admin/index";
//	}
    
}
