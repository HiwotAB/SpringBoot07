package hiwotab.springboot07.controller;

import hiwotab.springboot07.Model.Tvshow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// controller class is used as intermidate to our model  to the data base
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
    // TO show the the form that is used to enter tv shows
    @GetMapping("/tvform")
    public String loadTVShowForm(Model model) {
        model.addAttribute("tvshow", new Tvshow());
        return "tvform";
    }
    @GetMapping("/valtvform")
    public String loadTVShowForms(Model model) {
        model.addAttribute("tvshow", new Tvshow());
        return "valtvform";
    }
    // TO submit the list of attribute values to the data base
    @PostMapping("/tvform")
    public String loadTVShowForm(@Valid @ModelAttribute("tvshow") Tvshow tvshow, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "tvform";
        }

        return "tvshowconfirm";
    }

}
