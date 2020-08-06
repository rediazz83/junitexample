package edu.globant.junitexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {

    @Test
    void shouldReturnHelloWorld() {
        Greating greating = new Greating();

        String result = greating.helloWorld();

        assertEquals("Hello World", result);
    }

    @Test
    void shouldReturnHelloWorldWithName() {
        Greating greating = new Greating();

        String result = greating.helloWorld("Rodri");

        assertEquals("Hello Rodri", result);
    }
}