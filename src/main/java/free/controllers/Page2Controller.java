package free.controllers;

import free.model.ValueHolder;
import free.model.ValueHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;


@Controller
public class Page2Controller {

    @RequestMapping(value="/page/2", method=RequestMethod.GET)
    public String index(Model model) {
        return "page2";
    }

    @RequestMapping(value="/page/2", method=RequestMethod.POST)
    @ResponseBody
    public RedirectView store(@RequestParam String value) {
        Optional<ValueHolder> optValueHolder = mValueHolderRepo.findById(value);
        if(optValueHolder.isPresent()) {
            ValueHolder holder = optValueHolder.get();
            return new RedirectView(String.format("/page/3/exists?value=%s", value));
        } else {
            mValueHolderRepo.save(new ValueHolder(value));
            return new RedirectView(String.format("/page/3/new?value=%s", value));
        }

    }


    @Autowired
    private ValueHolderRepository mValueHolderRepo;
}
