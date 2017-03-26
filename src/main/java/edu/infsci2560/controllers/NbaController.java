/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.OldNba;
import edu.infsci2560.repositories.NbaRepository;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class NbaController {
    @Autowired
    private NbaRepository repository;
    
    @RequestMapping(value = "nbas", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("nbas", "nbas", repository.findAll());
    }
    
    @RequestMapping(value = "nbas/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid OldNba nba, BindingResult result) {
        repository.save(nba);
        return new ModelAndView("nbas", "nbas", repository.findAll());
    }
    
    @RequestMapping(value = "nbas/delete", method = RequestMethod.GET)
    public ModelAndView deleteOldNba(@RequestParam(value = "id", required=true) Long id) {
        OldNba nbas = repository.findOne(id);
        
        if (nbas != null) {
            repository.delete(id);
        }

        return new ModelAndView("nbas", "nbas", repository.findAll());
    }
    
    @RequestMapping(value = "/nbas/put", method = RequestMethod.PUT)
    public ModelAndView updateGame(@RequestParam("id") Long id, @RequestParam String title, @RequestParam String player, @RequestParam String links) {
        OldNba nbas = repository.findOne(id);
        nbas.setPlayer(player);
        nbas.setTitle(title);
        nbas.setLinks(links);

        return new ModelAndView("nbas", "nbas", repository.findAll());
    }
    
}