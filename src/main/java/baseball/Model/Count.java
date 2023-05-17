package baseball.Model;

import java.util.List;

import static baseball.Controller.BaseBallController.ball;
import static baseball.Controller.BaseBallController.strike;

public class Count {
    private static boolean compareUserComputer(Integer computerNumber, Integer userNumber) {
        if (computerNumber == userNumber) {
            return true;
        } else {
            return false;
        }
    }

    private static void plusStrike() {
        strike += 1;
    }

    private static void plusBall() {
        ball += 1;
    }

    public static int countStrike(Integer computerNumber, Integer userNumber) {
        if (compareUserComputer(computerNumber, userNumber)) {
            plusStrike();
        }
        return strike;
    }

    public static int countBall(Integer index, Integer userIndex, Integer computerNumber, Integer userNumber) {
        if (index != userIndex) {
            if (compareUserComputer(computerNumber, userNumber)) {
                plusBall();
            }
        }
        return ball;
    }

    public static void resetBallStrike() {
        ball = 0;
        strike = 0;
    }

    public static void resetUserComputerNumber(List<Integer> computerNumber, List<Integer> realUserNumber) {
        computerNumber.clear();
        realUserNumber.clear();
    }
}
