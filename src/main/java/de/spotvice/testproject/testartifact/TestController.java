package de.spotvice.testproject.testartifact;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Thomas Engelhard
 */
@Controller
public class TestController {
    @GetMapping("/test")
    public String test(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }
}
