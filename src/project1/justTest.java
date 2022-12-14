package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {
        System.out.println(words(1));
    }
    public static String words(int inp) {
        String[] tensNames = {
                "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String[] numNames = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String cont = "";
        if (inp < 1000 && inp >= 100) {
            if (inp % 100 == 0) return numNames[inp%10] + " hundred";
            else {
                cont = numNames[inp / 100] + " hundred ";
                inp = inp%100;
            }
        }

        if (inp < 20) return cont + numNames[inp];
        if (inp < 100 && inp%10 == 0) return cont + tensNames[inp/10];
        if (inp < 100) return cont + tensNames[inp/10] + "-" + numNames[inp%10];
        return "";

    }
}
