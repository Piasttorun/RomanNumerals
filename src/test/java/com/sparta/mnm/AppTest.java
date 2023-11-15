package com.sparta.mnm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {

    @Test
    public void checkIV() {
        Assertions.assertEquals("IV",App.getRoman(4));
    }

    @Test
    public void checkIX() {
        Assertions.assertEquals("IX",App.getRoman(9));
    }

    @Test
    public void checkXXIX() {
        Assertions.assertEquals("XXIX", App.getRoman(29));
    }

    @Test
    public void checkLXXX() {
            Assertions.assertEquals("LXXX", App.getRoman(80));
    }

    @Test
    public void checkCCXCIV() {
        Assertions.assertEquals("CCXCIV",App.getRoman(294));
    }

    @Test
    public void checkMMXIX() {
        Assertions.assertEquals("MMXIX",App.getRoman(2019));
    }
}
