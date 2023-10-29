package racingcar.domain;

import racingcar.utils.RandomNumberGenerator;

public class Car {
    private static final int MOVING_CONDITION = 4;
    private final String name;
    private int movingCount;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        int randomNumber = RandomNumberGenerator.generate();
        if (randomNumber >= MOVING_CONDITION) {
            movingCount++;
        }
    }
}
