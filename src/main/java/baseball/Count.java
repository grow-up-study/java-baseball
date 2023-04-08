package baseball;

import static baseball.BaseBallController.strike;
import static baseball.BaseBallController.ball;

public class Count {

    public static int countStrike(Integer computerNumber, Integer userNumber) {
        if (computerNumber == userNumber) {
            strike += 1;
        }
        return strike;
    }

    public static int countBall(Integer index, Integer userIndex, Integer computerNumber, Integer userNumber) {
        if (index != userIndex) {
            if (computerNumber == userNumber) {
                ball += 1;
            }
        }
        return ball;
    }
}
