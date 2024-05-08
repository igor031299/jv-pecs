package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MAX_BUCKET_WIDTH = 500;
    private final Random random = new Random();
    private final NameSupplier nameSupplier = new NameSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            bulldozers.add(new Bulldozer(nameSupplier.getName(Bulldozer.class),
                    colorSupplier.getRandomColor(),
                    random.nextInt(MAX_BUCKET_WIDTH)));
        }
        return bulldozers;
    }
}
