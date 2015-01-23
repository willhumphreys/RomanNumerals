import java.util.HashMap;
import java.util.Map;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {

    private final Map<Integer, String> numeralMap;

    public RomanNumeralGeneratorImpl() {
        numeralMap = new HashMap<Integer, String>();

        numeralMap.put(1, "I");
        numeralMap.put(4, "IV");
        numeralMap.put(5, "V");
        numeralMap.put(9, "IX");
        numeralMap.put(10, "X");
    }

    @Override
    public String generate(int number) {

        int remaining = number;
        StringBuilder resultBuilder = new StringBuilder();
        StringBuilder endBuilder = new StringBuilder();
        while (remaining > 0) {

            final String numeral = numeralMap.get(remaining);

            if (numeral == null) {
                endBuilder.append("I");
                remaining--;
            } else {
                resultBuilder.append(numeral);
                remaining -= number;
            }
        }
        return resultBuilder.append(endBuilder).toString();
    }
}
