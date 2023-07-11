package dev.neverrieght.kolodischi_transport;

public class BusStop {
    private String name;
    private boolean destIsMinsk;
    private int[] buses;

    BusStop() {
        this.name = "New Stop";
    }

    BusStop(String name) {
        this.name = name;
    }

    BusStop(boolean destIsMinsk) {
        this.destIsMinsk = destIsMinsk;
    }

    BusStop(String name, boolean destIsMinsk) {
        this(name);
        this.destIsMinsk = destIsMinsk;
    }

    BusStop(String name, boolean destIsMinsk, int[] buses) {
        this(name, destIsMinsk);
        this.buses = new int[buses.length];
        for (int i = 0; i < buses.length; i++) {
            this.buses[i] = buses[i];
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int[] getBuses() {
        return this.buses;
    }

    public void setBuses(int[] newBuses) {
        this.buses = new int[newBuses.length];
        System.arraycopy(newBuses, 0, this.buses, 0, newBuses.length);
    }

}
