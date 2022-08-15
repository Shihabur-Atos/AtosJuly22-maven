package com.qa.app.testexamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackjackSimpleTest {

    @Test
    public void testPlay() {
        assertEquals(21, BlackjackSimple.play(22,21));
    }
}