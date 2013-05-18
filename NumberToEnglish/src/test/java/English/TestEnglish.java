package English;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/17/13
 * Time: 8:28 AM
 * To change this template use File | Settings | File Templates.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("unused")
public class TestEnglish {

    @Test
    public void readZeroWhenNumberIsZero() throws Exception {
        assertEquals("zero", English.NumberToEnglish(0));
    }
    @Test
    public void readNumberHasOneNumber() throws Exception {
        assertEquals("five", English.NumberToEnglish(5));
        assertEquals("one", English.NumberToEnglish(1));
    }
    @Test
    public void readNumberHasTwoNumber() throws Exception {
        assertEquals("fifteen", English.NumberToEnglish(15));
        assertEquals("eleven", English.NumberToEnglish(11));
    }
    @Test
    public void readNumberHasThreeNumber() throws Exception {
        assertEquals("one hundred twenty-five", English.NumberToEnglish(125));
    }
    @Test
    public void readNumberHasFourNumber() throws Exception {
         assertEquals("one thousand two hundred fifty-six", English.NumberToEnglish(1256));
    }
    @Test
    public void readNumberHasFiveNumber() throws Exception {
        assertEquals("twelve thousand five hundred four", English.NumberToEnglish(12504));
    }
    @Test
    public void readNumberHasSixNumber() throws Exception {
        assertEquals("one hundred sixty-two thousand five hundred four", English.NumberToEnglish(162504));
    }
    @Test
    public void readNumberHasSevenNumber() throws Exception {
        assertEquals("one million eight hundred twenty-five thousand thirty-four", English.NumberToEnglish(1825034));
    }

    @Test
    public void readNumberHasNineNumber() throws Exception {
        assertEquals("one billion two hundred fifty-seven million eight hundred ninety-five thousand three hundred four",
                English.NumberToEnglish(1257895304));
    }
    @Test
    public void readNegative() throws Exception {
        assertEquals("negative one hundred one", English.NumberToEnglish(-101));
        assertEquals("negative one billion two hundred fifty-seven million eight hundred ninety-five thousand three hundred four"
                , English.NumberToEnglish(-1257895304));
    }
}
