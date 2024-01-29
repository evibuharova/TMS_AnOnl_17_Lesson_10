import java.util.ArrayList;
import java.util.*;

public class Number {
    public static void printBlock(String numberDocument) {
        System.out.println(numberDocument.substring(0, 4) + numberDocument.substring(9, 13));
    }
    public static void printBlockNoLetter(String numberDocument) {
        numberDocument = numberDocument.replaceAll("[A-Za-z]{3}", "***");
        System.out.println(numberDocument);
    }

    public static void onlyLetters(String numberDocument) {
        numberDocument = numberDocument.substring(5, 8) + numberDocument.substring(14, 17) + numberDocument.substring(19, 20)+ numberDocument.substring(21, 22);
        numberDocument = numberDocument.toLowerCase();
        StringBuffer letter = new StringBuffer(numberDocument);
        letter.insert(3, "/");
        letter.insert(7, "/");
        letter.insert(9, "/");
        System.out.println(letter);
    }
    public static void upperRegistr (String numberDocument) {
        numberDocument = numberDocument.substring(5, 8) + numberDocument.substring(14, 17) + numberDocument.substring(19, 20)+ numberDocument.substring(21, 22);
        numberDocument = numberDocument.toUpperCase();
        StringBuilder firstWord = new StringBuilder("Letters");
        StringBuilder letter = new StringBuilder(numberDocument);
        letter.insert(3, "/");
        letter.insert(7, "/");
        letter.insert(9, "/");
        letter.insert(0, "Letters:");
        System.out.println(letter);
    }
}


