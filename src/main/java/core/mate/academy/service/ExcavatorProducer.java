package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MAX_BUCKET_VOLUME = 1000;
    private final Random random = new Random();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            excavators.add(new Excavator(new NameSupplier().getName(Excavator.class),
                    new ColorSupplier().getRandomColor(), random.nextInt(MAX_BUCKET_VOLUME)));
        }
        return excavators;
    }
}
