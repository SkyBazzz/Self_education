package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class MyFirstJunit5 {

    @RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName(value = "First Test")
    void myFirstTest() {
        String message = "1 + 1 should be equal to 2";
        System.out.println(message);
        assertEquals(2, 1 + 1, message);
    }

    @RepeatedTest(value = 3, name = "{displayName} {currentRepetition} / {totalRepetitions}")
    @DisplayName(value = "Second Test")
    void mySecondTest() {
        String message = "1 + 3 should be equal to 4";
        System.out.println(message);
        assertEquals(4, 1 + 3, message);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @Nested
    class NestedClass{
        @Test()
        @DisplayName(value = "Inner First Test")
        void myFirstInnerTest() {
            String message = "1 + 1 should be equal to 2";
            System.out.println(message);
            assertEquals(2, 1 + 1, message);
        }

        @Test()
        @DisplayName(value = "Inner Second Test")
        void mySecondInnerTest() {
            String message = "1 + 3 should be equal to 4";
            System.out.println(message);
            assertEquals(4, 1 + 3, message);
        }

        @AfterEach
        void afterEach() {
            System.out.println("Inner After each");
        }

        @BeforeEach
        void beforeEach() {
            System.out.println("Inner Before each");
        }
    }
}
