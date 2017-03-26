package edu.infsci2560.controllers;

import edu.infsci2560.models.FinalShoot;
import edu.infsci2560.repositories.FinalShootRepository;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class FinalShootController {
    @Autowired
    private FinalShootRepository repository;
    
    @RequestMapping(value = "finalShoot", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("finalShoot", "finalShoot", repository.findAll());
    }
    
    @RequestMapping(value = "finalShoot/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid FinalShoot finalShoot, BindingResult result) {
        repository.save(finalShoot);
        return new ModelAndView("finalShoot", "finalShoot", repository.findAll());
    }
    
    @RequestMapping(value = "finalShoot/delete", method = RequestMethod.GET)
    public ModelAndView deleteFinalShoot(@RequestParam(value = "id", required=true) Long id) {
        FinalShoot finalShoot = repository.findOne(id);
        
        if (finalShoot != null) {
            repository.delete(id);
        }

        return new ModelAndView("finalShoot", "finalShoot", repository.findAll());
    }
    
}