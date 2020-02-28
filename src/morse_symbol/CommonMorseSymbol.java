package morse_symbol;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommonMorseSymbol {
    public static Map<Character, String> commonMorseSymbol = new LinkedHashMap<>();

    static {
        commonMorseSymbol.put('1', "· − − − −");
        commonMorseSymbol.put('2', "· · − − −");
        commonMorseSymbol.put('3', "· · · − −");
        commonMorseSymbol.put('4', "· · · · −");
        commonMorseSymbol.put('5', "· · · · ·");
        commonMorseSymbol.put('6', "− · · · ·");
        commonMorseSymbol.put('7', "− − · · ·");
        commonMorseSymbol.put('8', "− − − · ·");
        commonMorseSymbol.put('9', "− − − − ·");
        commonMorseSymbol.put('0', "− − − − −");
        commonMorseSymbol.put('.', "· · · · · ·");
        commonMorseSymbol.put(',', "· − · − · −");
        commonMorseSymbol.put(':', "− − − · · ·");
        commonMorseSymbol.put(';', "− · − · − ·");
        commonMorseSymbol.put('(', "− · − − · −");
        commonMorseSymbol.put(')', "− · − − · −");
        commonMorseSymbol.put('\'', "· − − − − ·");
        commonMorseSymbol.put('\"', "· − · · − ·");
        commonMorseSymbol.put('-', "− · · · · −");
        commonMorseSymbol.put('\\', "− · · − ·");
        commonMorseSymbol.put('_', "· · − − · −");
        commonMorseSymbol.put('?', "· · − − · ·");
        commonMorseSymbol.put('!', "− − · · − −");
        commonMorseSymbol.put('+', "· − · − ·");
        commonMorseSymbol.put('\u00A7', "− · · · −");
        commonMorseSymbol.put('\u0040', "· − − · − ·");
    }
}
