import java.text.DecimalFormat;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor,country,cost,3);

    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        }
        this.country = country;
    }
    public double getCost() {
        new DecimalFormat("0.00").format(cost);
        return cost;
    }
    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
    }
    @Override
    public String toString() {
        return "Flower{" +
                "цвет='" + flowerColor + '\'' +
                ", страна='" + country + '\'' +
                ", цена=" + new DecimalFormat("0.00").format(cost) +
                ", дней стояния=" + lifeSpan +
                '}';
    }
}
