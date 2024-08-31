package racingcar.message;

public enum ErrorMessage {

    INPUT_BLANK_WARNING("빈 값을 입력하셨습니다. 시도횟수를 입력해주세요"),
    INPUT_NOT_INTEGER("숫자만 입력할 수 있습니다."),
    INVALIDATE_NUMBER("횟수를 잘못 입력하셨습니다. 1이상의 숫자를 입력해주세요."),
    EXCESSED_NAME_LENGTH("5글자 이하의 이름만 입력가능합니다."),
    INPUT_DUPLICATEDNAME("중복된 이름을 입력하였습니다."),

    INPUT_WRONG_DELIMITER(" ,(쉼표)로 이름을 구분해주세요 할 수 있습니다.");
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
