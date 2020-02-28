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

public class FromMorseToLanguage extends Translation {
    public static final String MORSE_LATIN = "Decode Morse to Latin symbols";
    public static final String MORSE_CYRILLIC = "Decode Morse to Cyrillic symbols";
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

    private List<String> bufferForSourceFile = new ArrayList<>();

    private void writeFromSourceFileToBuffer() {
        char slash = '/';
        try {
            FileReader fileReader = new FileReader(sourceFilePath);
            int symbol;
            StringBuilder sb = new StringBuilder();
            while ((symbol = fileReader.read()) != -1) {
                String s = String.valueOf((char) symbol);
                if (symbol != slash) {
                    sb.append(s);
                } else {
                    bufferForSourceFile.add(String.valueOf(sb));
                    sb = new StringBuilder();
                }
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFromBufferToTargetFile() {
        if (this.getLanguageSelection().equals(MORSE_LATIN)) {
            CommonMorseSymbol.commonMorseSymbol.putAll(LatinMorseSymbol.latinMorseSymbol);
        } else if (this.getLanguageSelection().equals(MORSE_CYRILLIC)) {
            CommonMorseSymbol.commonMorseSymbol.putAll(CyrillicMorseSymbol.cyrillicMorseSymbol);
        }
        try {
            FileWriter fileWriter = new FileWriter(targetFilePath);
            for (String symbol : bufferForSourceFile) {
                for (Map.Entry<Character, String> pair : CommonMorseSymbol.commonMorseSymbol.entrySet()) {
                    char key = pair.getKey();
                    String value = pair.getValue();
                    if (symbol.equals(value)) {
                        fileWriter.write(key);
                    }
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
