import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanConverterTest {
    
    @Test
    void testSingleDigits() {
        assertEquals("I", IntegerToRomanConverter.toRoman(1));
        assertEquals("II", IntegerToRomanConverter.toRoman(2));
        assertEquals("III", IntegerToRomanConverter.toRoman(3));
        assertEquals("IV", IntegerToRomanConverter.toRoman(4));
        assertEquals("V", IntegerToRomanConverter.toRoman(5));
    }
    
    @Test
    void testTens() {
        assertEquals("X", IntegerToRomanConverter.toRoman(10));
        assertEquals("XX", IntegerToRomanConverter.toRoman(20));
        assertEquals("XXX", IntegerToRomanConverter.toRoman(30));
        assertEquals("XL", IntegerToRomanConverter.toRoman(40));
        assertEquals("L", IntegerToRomanConverter.toRoman(50));
    }
    
    @Test
    void testHundreds() {
        assertEquals("C", IntegerToRomanConverter.toRoman(100));
        assertEquals("CC", IntegerToRomanConverter.toRoman(200));
        assertEquals("CCC", IntegerToRomanConverter.toRoman(300));
        assertEquals("CD", IntegerToRomanConverter.toRoman(400));
        assertEquals("D", IntegerToRomanConverter.toRoman(500));
    }
    
    @Test
    void testThousands() {
        assertEquals("M", IntegerToRomanConverter.toRoman(1000));
        assertEquals("MM", IntegerToRomanConverter.toRoman(2000));
        assertEquals("MMM", IntegerToRomanConverter.toRoman(3000));
    }
    
    @Test
    void testComplexNumbers() {
        assertEquals("XC", IntegerToRomanConverter.toRoman(90));
        assertEquals("CDXLIV", IntegerToRomanConverter.toRoman(444));
        assertEquals("CMXCIX", IntegerToRomanConverter.toRoman(999));
        assertEquals("MCMLXXXVII", IntegerToRomanConverter.toRoman(1987));
        assertEquals("MMMCMXCIX", IntegerToRomanConverter.toRoman(3999));
    }
    
    @Test
    void testOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRomanConverter.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRomanConverter.toRoman(4000));
    }
}
