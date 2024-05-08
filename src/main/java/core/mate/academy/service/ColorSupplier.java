package core.mate.academy.service;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_COLOR_INDEX = Colors.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(MAX_COLOR_INDEX)].name();
    }
}
