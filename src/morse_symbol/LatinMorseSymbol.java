package morse_symbol;

import java.util.LinkedHashMap;
import java.util.Map;

public class LatinMorseSymbol extends CommonMorseSymbol {
    public static Map<Character, String> latinMorseSymbol = new LinkedHashMap<>();

    static {
        latinMorseSymbol.put('a', "· −");
        latinMorseSymbol.put('b', "− · · ·");
        latinMorseSymbol.put('c', "− · − ·");
        latinMorseSymbol.put('d', "− · ·");
        latinMorseSymbol.put('e', "·");
        latinMorseSymbol.put('f', "· · − ·");
        latinMorseSymbol.put('g', "− − ·");
        latinMorseSymbol.put('h', "· · · ·");
        latinMorseSymbol.put('i', "· ·");
        latinMorseSymbol.put('j', "· − − −");
        latinMorseSymbol.put('k', "− · −");
        latinMorseSymbol.put('l', "· − · ·");
        latinMorseSymbol.put('m', "− −");
        latinMorseSymbol.put('n', "− ·");
        latinMorseSymbol.put('o', "− − −");
        latinMorseSymbol.put('p', "· − − ·");
        latinMorseSymbol.put('q', "− − · −");
        latinMorseSymbol.put('r', "· − ·");
        latinMorseSymbol.put('s', "· · ·");
        latinMorseSymbol.put('t', "−");
        latinMorseSymbol.put('u', "· · −");
        latinMorseSymbol.put('v', "· · · −");
        latinMorseSymbol.put('w', "· − −");
        latinMorseSymbol.put('x', "− · · −");
        latinMorseSymbol.put('y', "− · − −");
        latinMorseSymbol.put('z', "− − · ·");
    }
}
