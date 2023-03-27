package foo.bar.controller;

import foo.bar.domain.Greeting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerTest {

    // Class Under Test
    Controller cut;

    @BeforeEach
    void setUp() {
        cut = new Controller();
    }

    /**
     * Gherkin should also be used in unit tests.
     * I also start each test with these comments: GIVEN; WHEN; THEN
     */
    @Test
    void greetings_withParam() {
        // GIVEN
        // Setup Test Data
        String name = "Mark";

        // WHEN
        // Invoke Method. Always one line.
        Greeting result = cut.greetings(name);

        // THEN
        // Assertions and Validations
        Assertions.assertEquals("Hello, Mark!", result.content());
        Assertions.assertEquals(Long.valueOf("1"), result.id());
    }

    @Test
    void greeting_withParam() {
        // GIVEN
        String name = "Mark";

        // WHEN
        Greeting result = cut.greeting(name);

        // THEN
        Assertions.assertEquals("Hello, Mark!", result.content());
        Assertions.assertEquals(Long.valueOf("1"), result.id());
    }
}