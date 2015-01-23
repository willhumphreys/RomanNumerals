import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RomanNumeralGeneratorImplTest {

    @Test
    public void shouldConvert1ToI() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(1);
        assertThat(numeral, is(equalTo("I")));
    }

    @Test
    public void shouldConvert2ToII() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(2);
        assertThat(numeral, is(equalTo("II")));
    }

    @Test
    public void shouldConvert3ToIII() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(3);
        assertThat(numeral, is(equalTo("III")));
    }

    @Test
    public void shouldConvert4ToIV() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(4);
        assertThat(numeral, is(equalTo("IV")));
    }

    @Test
    public void shouldConvert5ToV() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(5);
        assertThat(numeral, is(equalTo("V")));
    }

    @Test
    public void shouldConvert6ToVI() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(6);
        assertThat(numeral, is(equalTo("VI")));
    }

    @Test
    public void shouldConvert7ToVII() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(7);
        assertThat(numeral, is(equalTo("VII")));
    }

    @Test
    public void shouldConvert8ToVIII() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(8);
        assertThat(numeral, is(equalTo("VIII")));
    }

    @Test
    public void shouldConvert9ToIX() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(9);
        assertThat(numeral, is(equalTo("IX")));
    }

    @Test
    public void shouldConvert10ToX() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(10);
        assertThat(numeral, is(equalTo("X")));
    }

    @Test
    public void shouldConvert11ToXI() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(11);
        assertThat(numeral, is(equalTo("XI")));
    }

    @Test
    public void shouldConvert16ToXVI() throws Exception {
        final String numeral = new RomanNumeralGeneratorImpl().generate(16);
        assertThat(numeral, is(equalTo("XVI")));
    }
}
