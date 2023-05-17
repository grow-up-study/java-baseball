package baseball.Controller;

import baseball.Util.ConsoleMessage;
import camp.nextstep.edu.missionutils.Console;

import static baseball.Controller.BaseBallController.*;
import static baseball.Model.CreateNumber.createRandomNumber;

public class Regame {

    public static boolean restart() {

        System.out.println(ConsoleMessage.INPUT_GAME_COMMAND.getMessage());
        String restartExit = Console.readLine();
        System.out.println(restartExit);

        if (restartExit.equals("1")) {
            gameStart(createRandomNumber());
        } else if (restartExit.equals("2")) {
            System.out.println(ConsoleMessage.EXIT_GAME.getMessage());
            return gameFlag = false;
        }
        return gameFlag;
    }



}
