package edu.globant.junitexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {

    private Greating greating;

    @BeforeEach
    void setUp() {
        greating = new Greating();
    }

    @Test
    void shouldReturnHelloWorld() {
        String result = greating.helloWorld();

        assertEquals("Hello World", result);
    }

    @Test
    void shouldReturnHelloWorldWithName() {
        String result = greating.helloWorld("Rodri");

        assertEquals("Hello Rodri", result);
    }
}