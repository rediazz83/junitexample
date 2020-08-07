package edu.globant.junitexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {

    private Greating greating;

    @BeforeEach
    void setUp() {
        System.out.println("Method: setUp");

        greating = new Greating();
    }

    @Test
    void shouldReturnHelloWorld() {
        System.out.println("Method: shouldReturnHelloWorld");

        String result = greating.helloWorld();

        assertEquals("Hello World", result);
    }

    @Test
    void shouldReturnHelloWorldWithName() {
        System.out.println("Method: shouldReturnHelloWorldWithName");

        String result = greating.helloWorld("Rodri");

        assertEquals("Hello Rodri", result);
    }
}