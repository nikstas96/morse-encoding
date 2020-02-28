package translation;

import morse_symbol.CommonMorseSymbol;
import morse_symbol.CyrillicMorseSymbol;
import morse_symbol.LatinMorseSymbol;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FromLanguageToMorse extends Translation {
    public static final String LATIN_MORSE = "Encode Latin on the Morse code";
    public static final String CYRILLIC_MORSE = "Encode Cyrillic on the Morse code";
    private String languageSelection;

    public String getLanguageSelection() {
        return languageSelection;
    }

    public void setLanguageSelection(String languageSelection) {
        this.languageSelection = languageSelection;
    }

    public void translate() {
        writeFromSourceFileToBuffer();
        writeFromBufferToTargetFile();
    }

    private List<Character> bufferForSourceFile = new ArrayList<>();

    private void writeFromSourceFileToBuffer() {
        try {
            FileReader fileReader = new FileReader(sourceFilePath);
            int symbol;
            while ((symbol = fileReader.read()) != -1) {
                bufferForSourceFile.add((char) symbol);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFromBufferToTargetFile() {
        if (this.getLanguageSelection().equals(LATIN_MORSE)) {
            CommonMorseSymbol.commonMorseSymbol.putAll(LatinMorseSymbol.latinMorseSymbol);
        } else if (this.getLanguageSelection().equals(CYRILLIC_MORSE)) {
            CommonMorseSymbol.commonMorseSymbol.putAll(CyrillicMorseSymbol.cyrillicMorseSymbol);
        }
        try {
            FileWriter fileWriter = new FileWriter(targetFilePath);
            for (char symbol : bufferForSourceFile) {
                for (Map.Entry<Character, String> pair : CommonMorseSymbol.commonMorseSymbol.entrySet()) {
                    char key = pair.getKey();
                    String value = pair.getValue();
                    if (symbol == key) {
                        fileWriter.write(value + "/");
                    }
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
