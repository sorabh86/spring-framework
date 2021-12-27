/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sorabh
 */
@Controller
public class MainController {
    
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
