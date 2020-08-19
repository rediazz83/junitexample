package edu.globant.junitexample.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index(), "Wrong view returned");
    }

    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive msg to build for my test");
    }
}