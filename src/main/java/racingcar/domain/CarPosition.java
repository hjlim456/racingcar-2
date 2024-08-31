package racingcar.domain;

public class CarPosition {

    private int position;

    public CarPosition(int position) {
        this.position = position;
    }


    public void increment() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
