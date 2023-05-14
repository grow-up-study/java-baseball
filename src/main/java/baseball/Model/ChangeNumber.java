package baseball.Model;

import java.util.ArrayList;
import java.util.List;

public class ChangeNumber {
    public static List<Integer> changeUserNumber(String userNumber) {
        List<Integer> realUserNumber = new ArrayList<>();
        for (int index = 0; index < userNumber.length(); index++) {
            realUserNumber.add(parseToInteger(userNumber.charAt(index)));
        }
        return realUserNumber;
    }

    private static int parseToInteger(char ch) {
        return ch - '0';
    }
}
