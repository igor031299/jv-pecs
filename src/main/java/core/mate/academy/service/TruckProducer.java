package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_LIFTING_CAPACITY = 40;
    private final Random random = new Random();
    private final NameSupplier nameSupplier = new NameSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            trucks.add(new Truck(nameSupplier.getName(Truck.class),
                    colorSupplier.getRandomColor(), random.nextInt(MAX_LIFTING_CAPACITY)));
        }
        return trucks;
    }
}
