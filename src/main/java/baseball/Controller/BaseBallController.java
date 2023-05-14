package baseball.Controller;

import baseball.Model.CreateNumber;
import baseball.Util.ConsoleMessage;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static baseball.Model.ChangeNumber.changeUserNumber;
import static baseball.Model.Check.*;
import static baseball.Model.Count.resetBallStrike;
import static baseball.View.Print.printResult;

public class BaseBallController {
    public static boolean gameFlag = true;
    public static int strike = 0;
    public static int ball = 0;

    public static void gameStart(List<Integer> computerNumber) {

        gameFlag = true;
        System.out.println(ConsoleMessage.START_GAME.getMessage());

        while (gameFlag) {
            System.out.print(ConsoleMessage.INPUT_PLAYER_NUMBER.getMessage());
            String userNumber = Console.readLine();
            List<Integer> realUserNumber = changeUserNumber(userNumber);
            System.out.println(userNumber);
            check(userNumber, realUserNumber, computerNumber);
            resetBallStrike();
        }
    }

    private static void check(String userNumber, List<Integer> realUserNumber, List<Integer> computerNumber) {
        checkError(userNumber);
        checkStrike(computerNumber, realUserNumber);
        checkBall(computerNumber, realUserNumber);
        printResult(ball, strike);
        checkAnswer(computerNumber, realUserNumber);
    }
}
