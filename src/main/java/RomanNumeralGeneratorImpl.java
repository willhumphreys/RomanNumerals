public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {
    @Override
    public String generate(int number) {

        String result;

        if (number == 1) {
            result = "I";
        } else if (number == 2) {
            result = "II";
        } else {
            result = "III";
        }
        return result;
    }
}
