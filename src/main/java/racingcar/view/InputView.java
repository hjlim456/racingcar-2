package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.message.ErrorMessage;

public class InputView {

    //이름 입력받기 기능
    public static String readCarNames(String message) {
        System.out.println(message);
        String inputValue = Console.readLine().trim();
        validateBlank(inputValue);
        return inputValue;

    }

    //횟수 입력 받기 기능
    public static int readTryCount(String message) {
        System.out.println(message);
        String inputInteger = Console.readLine().trim();
        validateBlank(inputInteger);
        validateInteger(inputInteger);

        int count = Integer.parseInt(inputInteger);
        validateCount(count);
        return count;
    }


    private static void validateBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_BLANK_WARNING.getMessage());
        }
    }

    private static void validateInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_NOT_INTEGER.getMessage());
        }
    }

    private static void validateCount(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_NOT_VALIDATE_NUMBER.getMessage());
        }
    }

    private static void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_INVALIDATE_NAME_LENGTH.getMessage());
        }
    }


}
