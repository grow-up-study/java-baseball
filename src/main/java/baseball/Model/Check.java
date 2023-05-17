package baseball.Model;

import baseball.Util.ConsoleMessage;

import java.util.List;

import static baseball.Controller.BaseBallController.strike;
import static baseball.Model.Count.*;
import static baseball.Controller.Regame.restart;

public class Check {

    private static final int CORRECT_NUMBER_LENGTH = 3;

    public static void checkError(String userNumber) {
        if (userNumber.length() != 3) {
            System.out.println(ConsoleMessage.UNCORRECT_LENGTH.getMessage());
            System.out.println(ConsoleMessage.EXIT_GAME.getMessage());
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

    private static void reset(List<Integer> computerNumber, List<Integer> realUserNumber) {
        resetBallStrike();
        resetUserComputerNumber(computerNumber, realUserNumber);
    }

    public static void checkAnswer(List<Integer> computerNumber, List<Integer> realUserNumber) {
        if (strike == 3) {
            System.out.println(ConsoleMessage.CORRECT_ANSWER.getMessage());
            reset(computerNumber, realUserNumber);
            restart();
        }
    }
}
