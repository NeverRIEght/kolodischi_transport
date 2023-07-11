package dev.neverrieght.kolodischi_transport;

public class BusRoute {
    int routeNumber;
    String[] busStops;

    BusRoute() {
        this.routeNumber = 0;
    }

    BusRoute(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    BusRoute(int routeNumber, String[] busStops) {
        this(routeNumber);
        this.busStops = busStops;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int newRouteNumber) {
        this.routeNumber = newRouteNumber;
    }

    public String[] getBusStops() {
        return busStops;
    }

    public void setBusStops(String[] newBusStops) {
        this.busStops = new String[newBusStops.length];
        System.arraycopy(newBusStops, 0, this.busStops, 0, newBusStops.length);
    }


}
