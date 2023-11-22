package com.sparta.mnm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    @Test
    public void checkIV() throws ValueException {
        Assertions.assertEquals("IV",App.getRoman(4));
    }

    @Test
    public void checkIX() throws ValueException {
        Assertions.assertEquals("IX",App.getRoman(9));
    }

    @Test
    public void checkXXIX() throws ValueException {
        Assertions.assertEquals("XXIX", App.getRoman(29));
    }

    @Test
    public void checkLXXX() throws ValueException {
            Assertions.assertEquals("LXXX", App.getRoman(80));
    }

    @Test
    public void checkCCXCIV() throws ValueException {
        Assertions.assertEquals("CCXCIV",App.getRoman(294));
    }

    @Test
    public void checkMMXIX() throws ValueException {
        Assertions.assertEquals("MMXIX",App.getRoman(2019));
    }

    @Test
    public void checkExceptionNegative() {
        Exception thrown = Assertions.assertThrows(ValueException.class, () -> {
            App.getRoman(-3);
        });

        Assertions.assertEquals("Negative values cannot be allowed for conversion", thrown.getMessage());
    }

    @Test
    public void checkExceptionLarger() {
        Exception thrown = Assertions.assertThrows(ValueException.class, () -> {
            App.getRoman(4000);
        });

        Assertions.assertEquals("Value is higher than allowed for conversion", thrown.getMessage());
    }

}
