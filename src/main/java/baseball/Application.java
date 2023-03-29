package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final int CORRECT_NUMBER_LENGTH = 3;
    private static int strike = 0;
    private static int ball = 0;
    private static boolean gameCheck = true;

    public static void main(String[] args) {
        gameStart(createRandomNumber());
    }

    public static List<Integer> createRandomNumber() {
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }

    public static void gameStart(List<Integer> computerNumber) {
        gameCheck = true;
        System.out.println("게임을 시작합니다!!!");
        while (gameCheck) {
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


    public static List<Integer> changeUserNumber(String userNumber) {
        List<Integer> realUserNumber = new ArrayList<>();
        for (int index = 0; index < userNumber.length(); index++) {
            realUserNumber.add(parseToInteger(userNumber.charAt(index)));
        }
        return realUserNumber;
    }

    public static int parseToInteger(char ch) {
        return ch - '0';
    }

    public static void checkError(String userNumber){
        if (userNumber.length() != 3) {
            System.out.println("3자리 수를 입력해주세요.");
            System.out.println("게임 종료!");
            throw new IllegalArgumentException();
        }
    }
    private static void checkStrike(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int index = 0; index < CORRECT_NUMBER_LENGTH; index++) {
            countStrike(computerNumber.get(index), userNumber.get(index));
        }
    }

    private static int countStrike(Integer computerNumber, Integer userNumber) {
        if (computerNumber == userNumber) {
            strike += 1;
        }
        return strike;
    }

    public static void checkBall(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int index = 0; index < CORRECT_NUMBER_LENGTH; index++) {
            for (int userIndex = 0; userIndex < CORRECT_NUMBER_LENGTH; userIndex++) {
                countBall(index, userIndex, computerNumber.get(index), userNumber.get(userIndex));
            }
        }
    }

    public static int countBall(Integer index, Integer userIndex, Integer computerNumber, Integer userNumber) {
        if (index != userIndex) {
            if (computerNumber == userNumber) {
                ball += 1;
            }
        }
        return ball;
    }

    public static void printResult(Integer ball, Integer strike) {
        if (ball != 0) {
            System.out.print(ball + "볼 ");
        }
        if (strike != 0) {
            System.out.println(strike + "스트라이크");
        }
        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
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

    public static boolean restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String restartExit = Console.readLine();
        System.out.println(restartExit);
        if (restartExit.equals("1")) {                  //작은 따옴표로 했더니 오류남 --> 와이??????
            gameStart(createRandomNumber());
        } else if (restartExit.equals("2")) {
            System.out.println("게임 종료");
            return gameCheck = false;
        }
        return gameCheck;
    }


    private static void resetUserComputerNumber(List<Integer> computerNumber, List<Integer> realUserNumber) {
        computerNumber.clear();
        realUserNumber.clear();
    }


    private static void resetBallStrike() {
        ball = 0;
        strike = 0;
    }
}
