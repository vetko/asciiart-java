package com.quickprogrammingtips.asciiart.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ASCIIArtGeneratorTest {

    @Test
    void testPrintTextArt_HelloWord() {
        ASCIIArtGenerator.printTextArt("Hello World!", ASCIIArtGenerator.ART_SIZE_MEDIUM);
    }

    @Test
    void testPrintTextArt_CustomFont_HelloWord() {
        ASCIIArtGenerator.printTextArt("Love is life!", ASCIIArtGenerator.ART_SIZE_SMALL, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_MONO,"@");
    }
}