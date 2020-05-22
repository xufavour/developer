package com.xufavour.developer.app.controller;

import com.xufavour.developer.java.demo.Const;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/version")
    public String getVersion(){
        return Const.version;
    }

}
