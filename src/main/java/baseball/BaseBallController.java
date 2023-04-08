package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static baseball.ChangeNumber.changeUserNumber;
import static baseball.Check.*;
import static baseball.Print.printResult;
import static baseball.Regame.*;

public class BaseBallController {
    public static boolean gameFlag = true;
    CreateNumber computerNumber = new CreateNumber();
    public static int strike = 0;
    public static int ball = 0;
    public static void gameStart(List<Integer> computerNumber) {
        gameFlag = true;
        System.out.println("게임을 시작합니다!!!");
        while (gameFlag) {
            System.out.print("숫자를 입력하세요 : ");
            String userNumber = Console.readLine();
            List<Integer> realUserNumber = changeUserNumber(userNumber);
            System.out.println(userNumber);
            checkError(userNumber);
            checkStrike(computerNumber, realUserNumber);
            checkBall(computerNumber, realUserNumber);
            printResult(ball, strike);
            checkAnswer(computerNumber, realUserNumber);
            resetBallStrike();
        }
    }
}
