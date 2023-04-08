package baseball;

import static baseball.CreateNumber.createRandomNumber;

public class Application {
    public static void main(String[] args) {
        BaseBallController.gameStart(createRandomNumber());
    }
}
