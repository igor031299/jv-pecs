package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Random;

public class NameSupplier {
    private static final int MAX_NAME_INDEX_TRUCK = TruckName.values().length;
    private static final int MAX_NAME_INDEX_BULLDOZER = BulldozerName.values().length;
    private static final int MAX_NAME_INDEX_EXCAVATOR = ExcavatorName.values().length;
    private final Random random = new Random();

    public String getName(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return BulldozerName.values()[random.nextInt(MAX_NAME_INDEX_BULLDOZER)].name();
        } else if (type == Truck.class) {
            return TruckName.values()[random.nextInt(MAX_NAME_INDEX_TRUCK)].name();
        } else if (type == Excavator.class) {
            return ExcavatorName.values()[random.nextInt(MAX_NAME_INDEX_EXCAVATOR)].name();
        }
        return null;
    }

}
