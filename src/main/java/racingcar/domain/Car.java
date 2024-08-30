package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }


    public void tryMoveForward() {
        if (moveRandom()) {
            position++;
        }
    }

    public String printPosition() {
        return name + " : " + "-".repeat(position);
    }

    private boolean moveRandom() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}
