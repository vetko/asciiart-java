# Note: [Original project](https://github.com/quickprogrammingtips/asciiart-java) adapted by vetko for the Gradle build-scan exercise
- Upgrade the gradle-wrapper to 6.7
- Several improvements + tests
- Added gradle theming and build-scan "Custom values"

# ASCII Art Generator for Java (with adaptations for the exercise)

Please see [ASCII Art Generator Library in Java](https://www.quickprogrammingtips.com/java/ascii-art-generator-library-in-java.html) for more details on this library.

## Library Usage

```java
ASCIIArtGenerator artGen = new ASCIIArtGenerator();
artGen.printTextArt("Hello", ASCIIArtGenerator.ART_SIZE_MEDIUM);
```

```java
ASCIIArtGenerator artGen = new ASCIIArtGenerator();
artGen.printTextArt("Love is life!", ASCIIArtGenerator.ART_SIZE_SMALL,ASCIIArtFont.ART_FONT_MONO,"@");
```

## Sample Ouput

```
***     ***              ***   ***             
***     ***              ***   ***             
***     ***              ***   ***             
***     ***     *****    ***   ***     *****   
***     ***    *******   ***   ***    *******  
***********   ****  ***  ***   ***   **** ****
***********   ***   ***  ***   ***   ***   ***
***     ***   *********  ***   ***   ***   ***
***     ***   *********  ***   ***   ***   ***
***     ***   ***        ***   ***   ***   ***
***     ***   ****       ***   ***   **** ****
***     ***    ********  ***   ***    *******  
***     ***     *******  ***   ***     *****   
```
