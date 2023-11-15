package com.sparta.mnm;

public class App {

    private static final int[] arabicNumerals = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};

    private static final String[] romanNumerals = new  String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static void main( String[] args ) {

    }

    /**
     * checks interactively by taking away the number from arabic numerals till it cant anymore
     * if it can, it will add that number (arabic) to the current roman numeral representation
     * The inbetween roman values (IV, IX, XC ...) are needed to represent the roman string
     * This is because is it very hard and inefficient to work out otherwise
     * @param number
     * @return Roman Numeral string
     */
    public static String getRoman(int number){
        StringBuilder romanNumeral = new StringBuilder();
        for (int i = 0; i < arabicNumerals.length; i++ ) {
            while (number >= arabicNumerals[i]) {
                number -= arabicNumerals[i];
                romanNumeral.append(romanNumerals[i]);
            }
        }
        return romanNumeral.toString();
    }


}
