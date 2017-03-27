package edu.infsci2560.controllers;

import edu.infsci2560.models.OldNba;
import edu.infsci2560.repositories.NbaRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class NbaEditController {
    @Autowired
    private NbaRepository repository;
    
    @RequestMapping(value = "nbas/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        OldNba nba = repository.findOne(id);
        return new ModelAndView("nbaEdit", "nba", nba);
    }
    
    @RequestMapping(value = "nbas/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid OldNba nba, BindingResult result) {
        repository.save(nba);
        return "redirect:/nbas";
    }        
}
