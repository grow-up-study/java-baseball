package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static baseball.BaseBallController.*;
import static baseball.CreateNumber.createRandomNumber;

public class Regame {
    //public static boolean gameFlag = true;
    //public static int strike = 0;
    //public static int ball = 0;


    public static boolean restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String restartExit = Console.readLine();
        System.out.println(restartExit);
        if (restartExit.equals("1")) {                  //작은 따옴표로 했더니 오류남 --> 와이??????
            gameStart(createRandomNumber());
        } else if (restartExit.equals("2")) {
            System.out.println("게임 종료");
            return gameFlag = false;
        }
        return gameFlag;
    }

    public static void resetUserComputerNumber(List<Integer> computerNumber, List<Integer> realUserNumber) {
        computerNumber.clear();
        realUserNumber.clear();
    }

    public static void resetBallStrike() {
        ball = 0;
        strike = 0;
    }

}
