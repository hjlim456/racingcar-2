package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final CarName name;
    private final CarPosition position;

    public Car(CarName name) {
        this.name = name;
        this.position = new CarPosition(0);
    }

    public void tryMoveForward() {
        if (TrueWith60percent()) {
            position.increment();
        }
    }

    public String printPosition() {
        return name.getName() + " : " + "-".repeat(position.getPosition());
    }

    private boolean TrueWith60percent() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }
}
