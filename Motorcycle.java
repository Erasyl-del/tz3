public class Motorcycle implements IVehicle {
    private final String motoType;      // спортивный/туристический и т.д.
    private final int engineVolumeCc;   // объем двигателя (см3)

    public Motorcycle(String motoType, int engineVolumeCc) {
        this.motoType = motoType;
        this.engineVolumeCc = engineVolumeCc;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle (" + motoType + ", " + engineVolumeCc + "cc) is riding.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Motorcycle (gasoline).");
    }

    @Override
    public String toString() {
        return "Motorcycle{type='" + motoType + "', engineVolumeCc=" + engineVolumeCc + "}";
    }
}
