package baseball.Util;

public enum ConsoleMessage {
    START_GAME("게임을 시작합니다!"),
    INPUT_PLAYER_NUMBER("숫자를 입력하세요 : "),
    INPUT_GAME_COMMAND("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    CORRECT_ANSWER("3개의 숫자를 모두 맞히셨습니다!"),
    UNCORRECT_LENGTH("3자리 수를 입력해주세요."),
    EXIT_GAME("게임 종료");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
