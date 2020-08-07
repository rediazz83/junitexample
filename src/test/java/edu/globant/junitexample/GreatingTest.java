package edu.globant.junitexample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {

    private Greating greating;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once!!");
    }

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

    @AfterEach
    void tearDown() {
        System.out.println("Method: tearDown");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called once!!");
    }
}