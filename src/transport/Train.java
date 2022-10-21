package transport;

public class Train extends Transport {
    private double tripPrice;
    private int travelTimeMinutes;
    private String departureStationName;
    private String endingStation;
    private int amountWagons;

    public Train(String brand, String model, int productionYears, String productionCountry, String color, int maxSpeed, double tripPrice,
                 int travelTimeMinutes, String departureStationName, String endingStation, int amountWagons) {
        super(brand, model, productionYears, productionCountry, color, maxSpeed);
        this.setTripPrice(tripPrice);
        this.setTravelTimeMinutes(travelTimeMinutes);
        if (departureStationName == null || departureStationName.isBlank()) {
            departureStationName = "Деппо";
        } else {
            this.departureStationName = departureStationName;
        }
        if (endingStation == null || endingStation.isBlank()) {
            endingStation = "Деппо";
        } else {
            this.endingStation = endingStation;
        }
        this.setAmountWagons(amountWagons);
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice <= 0) {
            this.tripPrice = 10.0;
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public int getTravelTimeMinutes() {
        return travelTimeMinutes;
    }

    public void setTravelTimeMinutes(int travelTimeMinutes) {
        if (travelTimeMinutes <= 0) {
            this.travelTimeMinutes = 21;
        } else {
            this.travelTimeMinutes = travelTimeMinutes;
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        if (amountWagons <= 0) {
            this.amountWagons = 2;
        } else {
            this.amountWagons = amountWagons;
        }
    }

    @Override
    public void refill() {
        System.out.println("Заправляем поезд дизелем!");
    }

    @Override
    public String toString() {
        return "Train{" +
                "tripPrice=" + tripPrice +
                ", travelTimeMinutes=" + travelTimeMinutes +
                ", departureStationName='" + departureStationName + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", amountWagons=" + amountWagons +
                '}';
    }
}
