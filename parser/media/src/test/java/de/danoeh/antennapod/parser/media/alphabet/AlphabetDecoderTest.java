package de.danoeh.antennapod.parser.media.alphabet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AlphabetDecoderTest {

    @Test
    public void GivenAnAlphabetDecoder_WhenDecoding_ThenAlphabetIsDecoded(){
        // Arrange
        List<Integer> encodedText = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        AlphabetDecoder sut = new AlphabetDecoder();

        // Act
        List<String> result = sut.decode(encodedText);

        // Assert
        List<String> expectedText = Arrays.asList("A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","Y", "Z");
        assertEquals(expectedText, result);
    }

    @Test
    public void GivenAnAlphabetDecoder_WithOutOfBoundEncodedText_WhenDecoding_ThenDefaultValueIsReturned(){
        // Arrange
        List<Integer> encodedText = Arrays.asList(-1, 27);
        AlphabetDecoder sut = new AlphabetDecoder();

        // Act
        List<String> result = sut.decode(encodedText);

        // Assert
        List<String> expectedText = Arrays.asList(null, null);
        assertEquals(expectedText, result);
    }
}
