import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {

    private final Map<Integer, String> numeralMap;

    public RomanNumeralGeneratorImpl() {
        numeralMap = new LinkedHashMap<Integer, String>();

        numeralMap.put(10, "X");
        numeralMap.put(9, "IX");
        numeralMap.put(5, "V");
        numeralMap.put(4, "IV");
        numeralMap.put(1, "I");
    }

    @Override
    public String generate(int number) {
        int remaining = number;
        StringBuilder resultBuilder = new StringBuilder();

        for (Map.Entry<Integer, String> numberNumeralEntry : numeralMap.entrySet()) {
                while (remaining >= numberNumeralEntry.getKey()) {
                    resultBuilder.append(numberNumeralEntry.getValue());
                    remaining -= numberNumeralEntry.getKey();
                }
        }
        return resultBuilder.toString();
    }
}
