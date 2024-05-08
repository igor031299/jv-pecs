package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {
    private int bucketVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketVolume) {
        super.setName(name);
        super.setColor(color);
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
