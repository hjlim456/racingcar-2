package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputString(String message) {
        System.out.println(message);
        String inputValue = Console.readLine().trim();
        return inputValue;

    }

    public static int inputInteger(String message) {
        System.out.println(message);
        String inputInteger = Console.readLine().trim();
        return Integer.parseInt(inputInteger);
    }
}
