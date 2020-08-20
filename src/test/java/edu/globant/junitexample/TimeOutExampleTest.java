package edu.globant.junitexample;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class TimeOutExampleTest {

    @Test
    public void timeOutTest() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(99);
            System.out.println("I got here");
        });
    }

    @Test
    public void timeOutPremptTest() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(99);
            System.out.println("I got here again");
        });
    }
}
