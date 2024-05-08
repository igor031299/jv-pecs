package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {
    private int liftingCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int liftingCapacity) {
        super.setName(name);
        super.setColor(color);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
