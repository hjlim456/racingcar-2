package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class OutputView {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMovingResult(List<Car> cars) {
        cars.forEach(car -> System.out.println(car.printPosition()));
        System.out.println();
    }


}
