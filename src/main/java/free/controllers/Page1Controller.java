package free.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Page1Controller {

    @RequestMapping("/page/1")
    public String index(Model model) {
        return "page1";
    }

}
