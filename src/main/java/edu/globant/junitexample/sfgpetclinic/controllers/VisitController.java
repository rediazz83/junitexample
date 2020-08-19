package edu.globant.junitexample.sfgpetclinic.controllers;

import edu.globant.junitexample.sfgpetclinic.fauxspring.BindingResult;
import edu.globant.junitexample.sfgpetclinic.fauxspring.WebDataBinder;
import edu.globant.junitexample.sfgpetclinic.model.Pet;
import edu.globant.junitexample.sfgpetclinic.model.Visit;
import edu.globant.junitexample.sfgpetclinic.services.PetService;
import edu.globant.junitexample.sfgpetclinic.services.VisitService;

import javax.validation.Valid;
import java.util.Map;


public class VisitController {

    private final VisitService visitService;
    private final PetService petService;

    public VisitController(VisitService visitService, PetService petService) {
        this.visitService = visitService;
        this.petService = petService;
    }

    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    public Visit loadPetWithVisit(Long petId, Map<String, Object> model) {
        Pet pet = petService.findById(petId);
        model.put("pet", pet);
        Visit visit = new Visit();
        pet.getVisits().add(visit);
        visit.setPet(pet);
        return visit;
    }

    public String initNewVisitForm(Long petId, Map<String, Object> model) {
        return "pets/createOrUpdateVisitForm";
    }

    public String processNewVisitForm(@Valid Visit visit, BindingResult result) {
        if (result.hasErrors()) {
            return "pets/createOrUpdateVisitForm";
        } else {
            visitService.save(visit);

            return "redirect:/owners/{ownerId}";
        }
    }
}
