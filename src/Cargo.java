public class Cargo {
    private int weight;
    private String description;

    public Cargo(int weight, String description) {
        this.weight = weight;
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
    }

    public boolean assignDrone(Drone drone) {
        if (drone.canCarry(cargo.getWeight())) {
            this.assignedDrone = drone;
            drone.setStatus("IN_FLIGHT");
            drone.setCurrentCargoWeight(cargo.getWeight());
            return true;
        }
        return false;
    }

    public void completeTask() {
        if (assignedDrone != null) {
            assignedDrone.setStatus("IDLE");
            assignedDrone.setCurrentCargoWeight(0);
            System.out.println("Delivery completed!");
        } else {
            System.out.println("No drones");
        }
    }
}