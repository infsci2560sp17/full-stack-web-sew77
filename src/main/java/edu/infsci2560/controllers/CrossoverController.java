package edu.infsci2560.controllers;

import edu.infsci2560.models.Crossover;
import edu.infsci2560.repositories.CrossoverRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class CrossoverController {
    @Autowired
    private CrossoverRepository repository;
    
    @RequestMapping(value = "crossover", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("crossover", "crossover", repository.findAll());
    }
    
    @RequestMapping(value = "crossover/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Crossover crossover, BindingResult result) {
        repository.save(crossover);
        return new ModelAndView("crossover", "crossover", repository.findAll());
    }
    
}