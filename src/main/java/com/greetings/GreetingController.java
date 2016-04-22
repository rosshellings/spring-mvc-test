package com.greetings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by uqrhelli on 22/04/2016.
 */
@Controller
public class GreetingController {

    @RequestMapping(value = "/")
    public String printWelcome() {
        return "greeting";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return "greeting";
    }
}
