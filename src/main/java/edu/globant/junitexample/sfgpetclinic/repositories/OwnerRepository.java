package edu.globant.junitexample.sfgpetclinic.repositories;

import edu.globant.junitexample.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
