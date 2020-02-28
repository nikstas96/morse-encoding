import translation.FromMorseToLanguage;
import translation.Translation;

public class Runner {
    public static void main(String[] args) {
        Translation translation = new Translation();
        translation.sourceFilePath();
        translation.targetFilePath();

        /*FromLanguageToMorse fromLanguageToMorse = new FromLanguageToMorse();
        fromLanguageToMorse.setLanguageSelection(FromLanguageToMorse.CYRILLIC_MORSE);
        fromLanguageToMorse.translate();*/

        FromMorseToLanguage fromMorseToLanguage = new FromMorseToLanguage();
        fromMorseToLanguage.setLanguageSelection(FromMorseToLanguage.MORSE_CYRILLIC);
        fromMorseToLanguage.translate();
    }
}
