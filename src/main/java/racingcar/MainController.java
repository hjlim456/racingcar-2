package racingcar;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.TrialCount;
import racingcar.message.ViewMessage;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class MainController {
    public void run() {
        Cars cars = initCars();
        TrialCount tryCount = initTrialCount();
        proceedGame(cars, tryCount);
        endGame(cars);
    }


    private static Cars initCars() {
        String nameStrings = InputView.readCarNames(ViewMessage.INPUT_CAR_NAME.getMessage());//이름 입력받기
        Cars cars = Cars.createCars(nameStrings);
        return cars;
    }

    private static TrialCount initTrialCount() {
        int tryCount = InputView.readTryCount(ViewMessage.INPUT_TRIAL_COUNT.getMessage());//시도횟수 입력받기
        return new TrialCount(tryCount);
    }

    private void proceedGame(Cars cars, TrialCount tryCount) {
        int triedCount = 0;
        OutputView.printMessage(ViewMessage.TRY_RESULT.getMessage());
        while (triedCount < tryCount.count()) {
            cars.tryMoveAll();
            OutputView.printMovingResult(cars);
            triedCount++;
        }
    }

    private void endGame(Cars cars) {
        List<Car> winnerList = cars.getWinnerList();
        OutputView.printWinnerResult(winnerList);
    }


}
