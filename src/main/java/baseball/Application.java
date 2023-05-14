package baseball;

import baseball.Controller.BaseBallController;

import static baseball.Model.CreateNumber.createRandomNumber;

public class Application {
    public static void main(String[] args) {
        BaseBallController.gameStart(createRandomNumber());
    }
}
