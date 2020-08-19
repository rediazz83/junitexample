package edu.globant.junitexample.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependertAssertions() {
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("12345689");

        assertAll("Properties test",
                () -> assertAll("Person props",
                        () -> assertEquals("Joe", owner.getFirstName(), "First name did not match"),
                        () -> assertEquals("Buck", owner.getLastName(), "Last name did not match")),
                () -> assertAll("Owner props",
                        () -> assertEquals("Key West", owner.getCity(), "City did not match"),
                        () -> assertEquals("12345689", owner.getTelephone(), "Telephj did not match"))
        );
    }
}