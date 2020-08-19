package edu.globant.junitexample.sfgpetclinic.controllers;

import edu.globant.junitexample.sfgpetclinic.fauxspring.Model;
import edu.globant.junitexample.sfgpetclinic.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
