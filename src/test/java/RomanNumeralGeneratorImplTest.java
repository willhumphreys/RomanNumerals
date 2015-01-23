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
}
