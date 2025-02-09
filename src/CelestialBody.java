public class CelestialBody {
    private String name;
    private int coordinateX;
    private int coordinateY;

    public CelestialBody(String name, int coordinateX, int coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}

class Planet extends CelestialBody {
    private String atmosphereType;

    public Planet(String name, double coordinateX, double coordinateY, String atmosphereType) {
        super(name, (int) coordinateX, (int) coordinateY);
        this.atmosphereType = atmosphereType;
    }

    public String getAtmosphereType() { return atmosphereType; }
}

class SpaceStation extends CelestialBody {
    private  int stationLevel;

    public SpaceStation(String name, double coordinateX, double coordinateY, int stationLevel) {
        super(name, (int) coordinateX, (int) coordinateY);
        this.stationLevel = stationLevel;
    }

    public int getStationLevel() { return stationLevel; }
}
