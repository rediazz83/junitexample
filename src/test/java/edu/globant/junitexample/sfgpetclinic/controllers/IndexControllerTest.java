package edu.globant.junitexample.sfgpetclinic.controllers;

import edu.globant.junitexample.sfgpetclinic.exceptions.ValueNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test proper view name is returned for index page")
    @Test
    void index() {
        assertEquals("index", controller.index(), "Wrong view returned");
        assertThat(controller.index()).isNotEqualTo("coso");
    }

    @DisplayName("Test throw ValueNotFoundException")
    @Test
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, () -> controller.oupsHandler());
    }
}