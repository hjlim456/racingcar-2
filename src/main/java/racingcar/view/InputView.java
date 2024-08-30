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
        return Integer.parseInt(inputInteger);
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
}
