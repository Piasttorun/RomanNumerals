package com.sparta.mnm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    @Test
    @DisplayName("Check if Roman representation is correct for 4")
    public void checkIV() {
        Assertions.assertEquals("IV",App.getRoman(4));
    }

    @Test
    @DisplayName("Check if Roman representation is correct for 9")
    public void checkIX() {
        Assertions.assertEquals("IX",App.getRoman(9));
    }

    @Test
    @DisplayName("Check if Roman representation is correct for 29")
    public void checkXXIX() {
        Assertions.assertEquals("XXIX", App.getRoman(29));
    }

    @Test
    @DisplayName("Check if Roman representation is correct for 80")
    public void checkLXXX() {
            Assertions.assertEquals("LXXX", App.getRoman(80));
    }

    @Test
    @DisplayName("Check if Roman representation is correct for 294")
    public void checkCCXCIV() {
        Assertions.assertEquals("CCXCIV",App.getRoman(294));
    }

    @Test
    @DisplayName("Check if Roman representation is correct for 2019")
    public void checkMMXIX() {
        Assertions.assertEquals("MMXIX",App.getRoman(2019));
    }
}
