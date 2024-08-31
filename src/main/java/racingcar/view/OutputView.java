package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.message.ViewMessage;

public class OutputView {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMovingResult(Cars cars) {
        cars.getPosition();
        System.out.println();
    }

    public static void printWinnerResult(List<Car> winnerList) {
        String winnerString = winnerList.stream()
                .map(Car::getName)
                .collect(Collectors.joining(ViewMessage.WINNER_RESULT_DELIMITER.getMessage()));
        System.out.printf(ViewMessage.WINNER_RESULT_FOMAT.getMessage(), winnerString);
    }


}
