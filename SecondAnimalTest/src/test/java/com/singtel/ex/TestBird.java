package com.singtel.ex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBird {
    public static class TestAnimal {
        private ByteArrayOutputStream redirectedOut;
        private final PrintStream out = System.out;

        @BeforeEach
        public void setUpStreams() {
            redirectedOut = new ByteArrayOutputStream();
            System.setOut(new PrintStream(redirectedOut));
        }

        @Test
        public void testSing() {
            Bird bird = new Bird();
            bird.sing();
            assertEquals("I am singing", redirectedOut.toString().trim());
        }

        @AfterEach
        public void restoreStreams() throws IOException {
            redirectedOut.close();
            System.setOut(out);
        }
    }
}
