public class Main {
    public static void main(String[] args) {

        Planet earth = new Planet("Earth", 0, 0, "Nitrogen-Oxygen");
        SpaceStation alpha = new SpaceStation("Alpha", 100, 100, 5);

        LightDrone lightDrone = new LightDrone("LD-001");
        HeavyDrone heavyDrone = new HeavyDrone("HD-001");

        Cargo smallCargo = new Cargo(30, "Food Supplies");
        Cargo largeCargo = new Cargo(150, "Construction Materials");

        DeliveryTask task1 = new DeliveryTask(earth, alpha, smallCargo);
        DeliveryTask task2 = new DeliveryTask(earth, alpha, largeCargo);

        if (task1.assignDrone(lightDrone)) {
            System.out.println("Task 1 assigned to " + lightDrone.getId());
        } else {
            System.out.println("Task 1 could not be assigned.");
        }

        if (task2.assignDrone(heavyDrone)) {
            System.out.println("Task 2 assigned to " + heavyDrone.getId());
        } else {
            System.out.println("Task 2 could not be assigned.");
        }

        task1.completeTask();
        task2.completeTask();

        double distance = Math.sqrt(Math.pow(alpha.getCoordinateX() - earth.getCoordinateX(), 2) +
                Math.pow(alpha.getCoordinateY() - earth.getCoordinateY(), 2));
        System.out.println("Light Drone flight time: " + lightDrone.calculateFlightTime(distance));
        System.out.println("Heavy Drone flight time: " + heavyDrone.calculateFlightTime(distance));
    }
}