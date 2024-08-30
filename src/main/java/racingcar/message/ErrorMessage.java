package racingcar.message;

public enum ErrorMessage {

    INPUT_BLANK_WARNING("빈 값을 입력하셨습니다. 시도횟수를 입력해주세요");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
