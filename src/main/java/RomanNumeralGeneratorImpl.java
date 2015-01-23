import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {

    private final Map<Integer, String> numeralMap;

    public RomanNumeralGeneratorImpl() {
        numeralMap = new LinkedHashMap<Integer, String>();

        numeralMap.put(1000, "M");
        numeralMap.put(900, "CM");
        numeralMap.put(500, "D");
        numeralMap.put(400, "CD");
        numeralMap.put(100, "C");
        numeralMap.put(90, "XC");
        numeralMap.put(50, "L");
        numeralMap.put(40, "XL");
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
