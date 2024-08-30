package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.message.ErrorMessage;
import racingcar.message.ViewMessage;
import racingcar.view.InputView;

public class MainController {
    public void run() {
        String nameStrings = InputView.readCarNames(ViewMessage.INPUT_CAR_NAME.getMessage());
        List<String> carNames = splitByDelimiter(nameStrings, ",");
        carNames.forEach(name -> InputView.validateNameLength(name));
        validateDuplicates(carNames);

    }

    private void validateDuplicates(List<String> carNames) {
        Set<String> uniqueNames = new HashSet<>();

        carNames.stream()
                .filter(name -> !uniqueNames.add(name))
                .findAny()
                .ifPresent(duplicatedName -> {
                    throw new IllegalArgumentException(ErrorMessage.INPUT_DUPLICATEDNAME.getMessage());
                });
    }

    public List<String> splitByDelimiter(String strings, String delimiter) {
        String[] splittedString = strings.split(delimiter);
        List<String> splittedStringList = Arrays.stream(splittedString)
                .map(String::trim)
                .toList();

        return splittedStringList;
    }
}
