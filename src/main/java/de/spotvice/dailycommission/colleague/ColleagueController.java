package de.spotvice.dailycommission.colleague;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.validation.Valid;

@Controller
//@RequestMapping("/colleagues")
public class ColleagueController {
    private ColleagueRepository colleagueRepository;

    @Inject
    public ColleagueController(ColleagueRepository colleagueRepository) {
        this.colleagueRepository = colleagueRepository;
    }

    @GetMapping("colleagues")
    public String showColleagues(Model model) {
        model.addAttribute("colleagues", colleagueRepository.findAll());
        return "colleagues";
    }

    @GetMapping("colleague_add")
    public String addColleague(Model model) {
        model.addAttribute("colleague", new Colleague());
        return "colleague_add";
    }

    @PostMapping("colleague_add")
    public String addColleague(@Valid @ModelAttribute Colleague colleague, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "";
        }

        colleagueRepository.save(colleague);
        model.addAttribute("colleagues", colleagueRepository.findAll());
        return "colleagues";
    }
}
