public  class VehicleWithEngine extends Vehicle{

    public VehicleWithEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {

    }public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}
