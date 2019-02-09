package de.spotvice.dailycommission;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Thomas Engelhard
 */
@Controller
public class AnErrorController implements ErrorController {
    @Override
    @RequestMapping("/error")
    public String getErrorPath() {
        return "/error";
    }
}