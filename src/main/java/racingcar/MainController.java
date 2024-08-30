package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.domain.Car;
import racingcar.message.ErrorMessage;
import racingcar.message.ViewMessage;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class MainController {
    public void run() {
        String nameStrings = InputView.readCarNames(ViewMessage.INPUT_CAR_NAME.getMessage());//이름 입력받기
        List<String> carNames = splitByDelimiter(nameStrings, ",");//이름 구분자로 분리
        carNames.forEach(name -> InputView.validateNameLength(name));// 길이 검증
        validateDuplicates(carNames);// 중복 검증

        List<Car> cars = carNames.stream() // 입력받은 이름으로 cars 생성.
                .map(Car::new)
                .toList();

        int tryCount = InputView.readTryCount(ViewMessage.INPUT_TRIAL_COUNT.getMessage());//시도횟수 입력받기

        proceedGame(cars, tryCount);
    }

    private void proceedGame(List<Car> cars, int tryCount) {
        int triedCount = 0;
        OutputView.printMessage(ViewMessage.TRY_RESULT.getMessage());
        while (triedCount < tryCount) {
            cars.forEach(Car::tryMoveForward);
            OutputView.printMovingResult(cars);
            triedCount++;
        }
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
