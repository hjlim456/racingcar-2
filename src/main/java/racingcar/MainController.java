package racingcar;

import java.util.Arrays;
import java.util.List;
import racingcar.message.ViewMessage;
import racingcar.view.InputView;

public class MainController {
    public void run() {
        String nameStrings = InputView.readCarNames(ViewMessage.INPUT_CAR_NAME.getMessage());
        List<String> carNames = splitByDelimiter(nameStrings, ",");
    }

    public List<String> splitByDelimiter(String strings, String delimiter) {
        String[] splittedString = strings.split(delimiter);
        List<String> splittedStringList = Arrays.stream(splittedString)
                .map(String::trim)
                .toList();
        
        return splittedStringList;
    }
}
