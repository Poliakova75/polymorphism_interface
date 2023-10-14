public class Bicycle extends Vehicle implements Serviced{
    private String type;
    private int numberOfGears;

    public Bicycle(String modelName, int wheelsCount, String type, int numberOfGears) {
        super(modelName, wheelsCount);
        this.type = type;
        this.numberOfGears = numberOfGears;
    }

    public String getType() {
        return type;
    }
    public int getNumberOfGears() {
        return numberOfGears;
    }
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку велосипеда");

        }
    }

    @Override
    public void check() {
        System.out.println("Обслуживание велосипеда " + getModelName());
    }

    @Override
    public String toString() {
        return "Велосипед " + getModelName() +
                "\nтип " + type +
                "\nкол-во скоростей " + numberOfGears;
    }
}
