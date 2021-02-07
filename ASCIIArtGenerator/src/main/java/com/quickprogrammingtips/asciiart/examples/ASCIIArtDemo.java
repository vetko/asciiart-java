package com.quickprogrammingtips.asciiart.examples;

import com.quickprogrammingtips.asciiart.lib.ASCIIArtGenerator;
import com.quickprogrammingtips.asciiart.lib.ASCIIArtGenerator.ASCIIArtFont;

/**
 * Demo of ASCIIArtGenerator library
 */

public class ASCIIArtDemo {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println(ASCIIArtGenerator.printTextArt("Hello", ASCIIArtGenerator.ART_SIZE_MEDIUM));
        System.out.println();
        
        System.out.println();
        System.out.println(ASCIIArtGenerator.printTextArt("Love is life!", ASCIIArtGenerator.ART_SIZE_SMALL,ASCIIArtFont.ART_FONT_MONO,"@"));
        System.out.println();
        
    }
}
