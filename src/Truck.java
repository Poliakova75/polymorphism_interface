public class Truck extends Vehicle implements Serviced{
    private int loadCapacity;
    private int bodyLength;

    public Truck(String modelName, int wheelsCount, int loadCapacity, int bodyLength) {
        super(modelName, wheelsCount);
        this.loadCapacity = loadCapacity;
        this.bodyLength = bodyLength;
    }
    public int getBodyLength() {
        return bodyLength;
    }
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void updateTyre() {
            for (int i = 0; i < getWheelsCount(); i++) {
                System.out.println("Меняем покрышку автомобиля");
            }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void check() {
        System.out.println("Обслуживание грузовика " + getModelName());
        super.check();
    }

    @Override
    public String toString() {
        return "Грузовик " + getModelName() +
                "\nгрузоподъёмность " + loadCapacity +
                "\nдлина " + bodyLength;
    }
}
