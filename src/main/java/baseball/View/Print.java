package baseball.View;

public class Print {
    private static void printBall(Integer ball){
        if (ball != 0) {
            System.out.print(ball + "볼 ");
        }
    }

    private static void printStrike(Integer strike){
        if (strike != 0) {
            System.out.println(strike + "스트라이크");
        }
    }

    private static void printNothing(Integer ball, Integer strike){
        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }
    }
    public static void printResult(Integer ball, Integer strike) {
        printBall(ball);
        printStrike(strike);
        printNothing(ball,strike);
    }
}
