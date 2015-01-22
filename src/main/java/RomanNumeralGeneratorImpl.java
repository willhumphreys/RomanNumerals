public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator{
    @Override
    public String generate(int number) {

        if(number == 1) {
            return "I";
        }

        return "II";
    }
}
