import java.util.HashMap;
import java.util.Map;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {

    private final Map<Integer, String> numeralMap;

    public RomanNumeralGeneratorImpl() {
        numeralMap = new HashMap<Integer, String>();

        numeralMap.put(1, "I");
        numeralMap.put(2, "II");
        numeralMap.put(3, "III");
        numeralMap.put(4, "IV");
        numeralMap.put(5, "V");
        numeralMap.put(6, "VI");
    }

    @Override
    public String generate(int number) {
        return numeralMap.get(number);
    }
}
