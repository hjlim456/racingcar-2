package racingcar.domain;

import racingcar.message.ErrorMessage;

public class CarName {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        validateNameLength(name);
        this.name = name;
    }

    public static void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.EXCESSED_NAME_LENGTH.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}
