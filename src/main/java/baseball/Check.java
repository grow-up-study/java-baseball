package baseball;

import java.util.List;

import static baseball.BaseBallController.strike;
import static baseball.Count.countBall;
import static baseball.Count.countStrike;
import static baseball.Regame.*;

public class Check {
    private static final int CORRECT_NUMBER_LENGTH = 3;
    public static void checkError(String userNumber) {
        if (userNumber.length() != 3) {
            System.out.println("3자리 수를 입력해주세요.");
            System.out.println("게임 종료!");
            throw new IllegalArgumentException();
        }
    }

    public static void checkStrike(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int index = 0; index < CORRECT_NUMBER_LENGTH; index++) {
            countStrike(computerNumber.get(index), userNumber.get(index));
        }
    }

    public static void checkBall(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int index = 0; index < CORRECT_NUMBER_LENGTH; index++) {
            for (int userIndex = 0; userIndex < CORRECT_NUMBER_LENGTH; userIndex++) {
                countBall(index, userIndex, computerNumber.get(index), userNumber.get(userIndex));
            }
        }
    }

    public static void checkAnswer(List<Integer> computerNumber, List<Integer> realUserNumber) {
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다!");
            resetBallStrike();
            resetUserComputerNumber(computerNumber, realUserNumber);
            restart();
        }
    }
}
