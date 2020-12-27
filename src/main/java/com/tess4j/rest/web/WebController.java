
package com.tess4j.rest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(value = "/")
    public String inicio() throws Exception {
        return "index";
    }

    @GetMapping(value = "/acerca-de")
    public String acerca_de() throws Exception {
        return "acerca_de";
    }

}
