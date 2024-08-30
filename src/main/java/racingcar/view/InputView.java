package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.message.ErrorMessage;

public class InputView {

    //이름 입력받기 기능
    public String inputString(String message) {
        System.out.println(message);
        String inputValue = Console.readLine().trim();
        validateBlank(inputValue);
        return inputValue;

    }

    //횟수 입력 받기 기능
    public static int inputInteger(String message) {
        System.out.println(message);
        String inputInteger = Console.readLine().trim();
        return Integer.parseInt(inputInteger);
    }


    private void validateBlank(String inputValue) {
        if (inputValue.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_BLANK_WARNING.getMessage());
        }
    }
}
