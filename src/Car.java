public class Car extends VehicleWithEngine implements Serviced {
    private String color;
    private String bodyType;

    public Car(String modelName, int wheelsCount, String color, String bodyType) {
        super(modelName, wheelsCount);
        this.bodyType = bodyType;
        this.color = color;
    }


    public String getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    public void startEngine() {
        System.out.println("Запускаем двигатель автомобиля ");

    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку автомобиля");
        }
    }
    @Override
    public void check() {
        System.out.println("Обслуживание автомобиля " + getModelName());
        super.check();
    }

    @Override
    public String toString() {
        return "Автомобиль " + getModelName() +
                "\nцвет " + color +
                "\nтип кузова " + bodyType;
    }
}




