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
}
