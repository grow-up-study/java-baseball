package baseball;

public class Print {
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
}
