package edu.globant.junitexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalExampleTest {

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS() {

    }

    @EnabledOnOs(OS.LINUX)
    @Test
    void testMeOnLinuxOS() {

    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {

    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {

    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "esteban.diaz")
    @Test
    void testMeIfEsteban() {

    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "rdiaz")
    @Test
    void testMeIfRdiaz() {

    }
}
