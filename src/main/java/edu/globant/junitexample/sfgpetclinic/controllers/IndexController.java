package edu.globant.junitexample.sfgpetclinic.controllers;

import edu.globant.junitexample.sfgpetclinic.exceptions.ValueNotFoundException;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oupsHandler() {
        throw new ValueNotFoundException();
    }
}
