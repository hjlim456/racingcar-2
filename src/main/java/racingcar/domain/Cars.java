package racingcar.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.message.ErrorMessage;

public record Cars(List<Car> carList) {


    public static Cars createCars(String nameStrings) {

        List<String> carNames = splitByDelimiter(nameStrings, ",");//이름 구분자로 분리
        validateDuplicates(carNames);// 중복 검증

        List<Car> cars = carNames.stream() // 입력받은 이름으로 cars 생성.
                .map(CarName::new)//CarName에 파라미터로 입력받은 string이 들어갔다.
                .map(Car::new)// 변환된 Stream<CarName>이 Car의 파라미터로 들어갔다.
                .toList();

        return new Cars(cars);
    }

    private static List<String> splitByDelimiter(String strings, String delimiter) {
        if (!strings.contains(delimiter)) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_WRONG_DELIMITER.getMessage());
        }

        String[] splittedString = strings.split(delimiter);
        List<String> splittedStringList = Arrays.stream(splittedString)
                .map(String::trim)
                .toList();

        return splittedStringList;
    }

    private static void validateDuplicates(List<String> carNames) {
        Set<String> uniqueNames = new HashSet<>();

        carNames.stream()
                .filter(name -> !uniqueNames.add(name))
                .findAny()
                .ifPresent(duplicatedName -> {
                    throw new IllegalArgumentException(ErrorMessage.INPUT_DUPLICATEDNAME.getMessage());
                });
    }

    public void tryMoveAll() {
        carList.forEach(Car::tryMoveForward);
    }

    public void getPosition() {
        carList.forEach(car -> System.out.println(car.printPosition()));
    }

    public List<Car> getWinnerList() {
        Integer winnerPosition = getWinnerPosition();
        return carList.stream()
                .filter(car -> car.getPosition() == winnerPosition)
                .toList();

    }

    private Integer getWinnerPosition() {
        return carList.stream()
                .map(Car::getPosition)
                .max(Comparator.naturalOrder())
                .orElse(0);
    }
}
