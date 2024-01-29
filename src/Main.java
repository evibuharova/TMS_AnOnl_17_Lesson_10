import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String str = "1234-ABc-5678-def-9g0h";
        Number.printBlock(str);
        Number.printBlockNoLetter(str);
        Number.onlyLetters(str);
        Number.upperRegistr(str);
    }
}