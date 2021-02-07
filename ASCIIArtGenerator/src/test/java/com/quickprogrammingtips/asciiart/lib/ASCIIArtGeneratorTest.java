package com.quickprogrammingtips.asciiart.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ASCIIArtGeneratorTest {

    @Test
    void testPrintTextArt_HelloWord() {
        String output = ASCIIArtGenerator.printTextArt("Hello world!", ASCIIArtGenerator.ART_SIZE_MEDIUM);
        assertOutput(output, 32);
    }

    @Test
    void testPrintTextArt_CustomFont_GradleRocks() {
        String output = ASCIIArtGenerator.printTextArt("Gradle rocks!", ASCIIArtGenerator.ART_SIZE_SMALL, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_MONO,"@");
        assertOutput(output, 256);
    }

    @Test
    void testPrintTextArt_GradleEnterpriseRocks() {
        String output = ASCIIArtGenerator.printTextArt("Gradle Enterprise rocks even more!", ASCIIArtGenerator.ART_SIZE_MEDIUM);
        assertOutput(output, 512);
    }

    private void assertOutput(String output, int oneNonSpaceCharIndex) {
        System.out.println(output); //for fancy build scan only

        assertNotNull(output, "Output should not be null!");
        assertFalse(output.trim().isEmpty(), "Output should not be empty!");
        assertNotEquals(' ', output.charAt(oneNonSpaceCharIndex),
                () -> String.format(
                        "Even if this test has failed, Gradle Enterprise still rocks! See the console or \"Custom values\" for more details :) \n" +
                        "(Original problem: The character at position %d should not be empty!)", oneNonSpaceCharIndex));
    }
}