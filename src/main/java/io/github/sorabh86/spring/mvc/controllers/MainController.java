/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sorabh
 */
@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index(Model m) {
        m.addAttribute("name", "Sorabh Sharma");
        m.addAttribute("course", "Master in Computer Application");
        return "index";
    }
    
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
    
    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }
    @RequestMapping(path="/contact", method=RequestMethod.POST)
    public String contact(@RequestParam String name, @RequestParam String email, 
            @RequestParam String message, Model m) {
        System.out.println("Successfully sent!!!");
        m.addAttribute("name", name);
        m.addAttribute("email", email);
        m.addAttribute("message", message);
        return "contact";
    }
}
