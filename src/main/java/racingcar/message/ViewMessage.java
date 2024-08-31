package racingcar.message;

public enum ViewMessage {
    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TRIAL_COUNT("시도할 횟수는 몇회인가요?"),
    TRY_RESULT("실행 결과\n"),

    WINNER_RESULT_FOMAT("최종 우승자는 : %s"),
    WINNER_RESULT_DELIMITER("\", \"");

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
