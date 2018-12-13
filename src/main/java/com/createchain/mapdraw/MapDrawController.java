package com.createchain.mapdraw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
public class MapDrawController {

    @RequestMapping("/draw")
    public String draw(){

        return "app";
    }
}
