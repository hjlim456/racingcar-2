package racingcar.domain;

import racingcar.message.ErrorMessage;

public class CarName {

    private final String name;

    public CarName(String name) {
        validateNameLength(name);
        this.name = name;
    }

    public static void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.EXCESSED_NAME_LENGTH.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}
