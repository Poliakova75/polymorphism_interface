public class Main {
    public static void main(String[] args) {
        Car bmv = new Car("BMW", 4, "чёрный", "седан");
        Car peugeot = new Car("Peugeot", 4, "белый", "хэтчбэк");

        Truck iveco = new Truck("Iveco ", 6, 11, 10);
        Truck man = new Truck("MAN", 10, 20, 5);

        Bicycle stern = new Bicycle("Stern", 2, "горный", 18);
        Bicycle format = new Bicycle("Format", 2, "шоссейный", 20);

        ServiceStation serviceStation = new ServiceStation();

        System.out.println(bmv);
        serviceStation.check(bmv);
        bmv.updateTyre();
        bmv.checkEngine();
        bmv.startEngine();
        System.out.println();
        System.out.println(peugeot);
        serviceStation.check(peugeot);
        peugeot.updateTyre();
        peugeot.checkEngine();
        peugeot.startEngine();
        System.out.println();

        System.out.println(stern);
        serviceStation.check(stern);
        stern.updateTyre();
        System.out.println();
        System.out.println(format);
        serviceStation.check(format);
        format.updateTyre();
        System.out.println();

        System.out.println(iveco);
        serviceStation.check(iveco);
        iveco.updateTyre();
        iveco.checkEngine();
        iveco.checkTrailer();
        System.out.println();
        System.out.println(man);
        serviceStation.check(man);
        man.updateTyre();
        man.checkEngine();
        man.checkTrailer();
    }
}

