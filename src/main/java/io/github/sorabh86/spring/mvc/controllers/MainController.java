/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
