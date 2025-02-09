public class Drone {
    private String id;
    private String status;
    private int cargoCapacity;
    private int currentCargoWeight;

    Drone(String id, int CargoCapacity){
        this.id = id;
        this.status = status;
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = currentCargoWeight;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setCurrentCargoWeight(int currentCargoWeight) {
        this.currentCargoWeight = currentCargoWeight;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    public boolean canCarry(int weight) {
        return weight <= cargoCapacity;
    }

    public double calculateFlightTime(double distance) {
        return distance / 100;
    }
}

class LightDrone extends Drone {
    public LightDrone(String id) {
        super(id, 50);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 150;
    }
}

class HeavyDrone extends Drone {
    public HeavyDrone(String id) {
        super(id, 200);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 75;
    }
}
