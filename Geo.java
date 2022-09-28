import java.lang.Math;

public class Geo {
    private double latitude;
    private double longitude;

    //////////// Criação do construtor ////////////

    public Geo(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //////////// Criação dos gets ////////////

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    /////////////// Calculo da distancia (Exercício) ////////////////////

    public double distancia(Geo loc, Geo loc1) {
        double lat1 = Math.toRadians(loc.getLatitude());
        double lat2 = Math.toRadians(loc1.getLatitude());
        double lon1 = Math.toRadians(loc.getLongitude());
        double lon2 = Math.toRadians(loc1.getLongitude());

        double diflat = (lat1 - lat2) / 2;
        double diflon = (lon1 - lon2) / 2;

        double d = Math.pow(Math.sin(diflat), 2) +
                Math.pow(Math.sin(diflon), 2) *
                        Math.cos(lat1) * Math.cos(lat2);

        d = 2 * 6371 * Math.asin(Math.sqrt(d));

        return d;
    }
}