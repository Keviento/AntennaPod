package de.danoeh.antennapod.parser.media.alphabet;

import java.util.ArrayList;
import java.util.List;

public class AlphabetDecoder {
    public List<String> decode(List<Integer> encodedLetters){
        ArrayList<String> decodedLetters = new ArrayList<>();

        for (Integer encodedLetter : encodedLetters){
            // from https://stackoverflow.com/questions/10813154/how-do-i-convert-a-number-to-a-letter-in-java
            decodedLetters.add(encodedLetter > 0 && encodedLetter < 27 ? String.valueOf((char)(encodedLetter + 64)) : null);
        }

        return decodedLetters;
    }
}
