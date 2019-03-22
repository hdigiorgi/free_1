package free.controllers;


import free.model.ValueHolder;
import free.model.ValueHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class Page3Controller {

    @RequestMapping(value="/page/3/exists", method=RequestMethod.GET)
    public String exists(@RequestParam("value") String value, Model model) {
        model.addAttribute("value", value);
        return "page3_exists";
    }

    @RequestMapping(value="/page/3/new", method=RequestMethod.GET)
    public String noExists(@RequestParam("value") String value, Model model) {
        model.addAttribute("value", value);
        return "page3_new";
    }

}
