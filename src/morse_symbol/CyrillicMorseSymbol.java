package morse_symbol;

import java.util.LinkedHashMap;
import java.util.Map;

public class CyrillicMorseSymbol extends CommonMorseSymbol {
    public static Map<Character, String> cyrillicMorseSymbol = new LinkedHashMap<>();

    static {
        cyrillicMorseSymbol.put('а', "· −");
        cyrillicMorseSymbol.put('б', "− · · ·");
        cyrillicMorseSymbol.put('в', "· − −");
        cyrillicMorseSymbol.put('г', "− − ·");
        cyrillicMorseSymbol.put('д', "− · ·");
        cyrillicMorseSymbol.put('е', "·");
        cyrillicMorseSymbol.put('ж', "· · · −");
        cyrillicMorseSymbol.put('з', "− − · ·");
        cyrillicMorseSymbol.put('и', "· ·");
        cyrillicMorseSymbol.put('й', "· − − −");
        cyrillicMorseSymbol.put('к', "− · −");
        cyrillicMorseSymbol.put('л', "· − · ·");
        cyrillicMorseSymbol.put('м', "− −");
        cyrillicMorseSymbol.put('н', "− ·");
        cyrillicMorseSymbol.put('о', "− − −");
        cyrillicMorseSymbol.put('п', "· − − ·");
        cyrillicMorseSymbol.put('р', "· − ·");
        cyrillicMorseSymbol.put('с', "· · ·");
        cyrillicMorseSymbol.put('т', "−");
        cyrillicMorseSymbol.put('у', "· · −");
        cyrillicMorseSymbol.put('ф', "· · − ·");
        cyrillicMorseSymbol.put('х', "· · · ·");
        cyrillicMorseSymbol.put('ц', "− · − ·");
        cyrillicMorseSymbol.put('ч', "− − − ·");
        cyrillicMorseSymbol.put('ш', "− − − −");
        cyrillicMorseSymbol.put('щ', "− − · −");
        cyrillicMorseSymbol.put('ъ', "− − · − −");
        cyrillicMorseSymbol.put('ы', "− · − −");
        cyrillicMorseSymbol.put('ь', "− · · −");
        cyrillicMorseSymbol.put('э', "· · − · ·");
        cyrillicMorseSymbol.put('ю', "· · − −");
        cyrillicMorseSymbol.put('я', "· − · −");
    }
}
