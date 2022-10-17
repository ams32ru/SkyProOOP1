public class Car {
    String brand;
    String model;
    int productionYears;
    String productionCountry;
    String color;
    float engineVolume;

    Car(String brand, String model, int productionYears, String productionCountry, String color, float engineVolume) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionYears == 0) {
            this.productionYears = 2000;
        } else {
            this.productionYears = productionYears;
        }

        if (productionCountry == null || productionCountry == "") {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }


    }

    @Override
    public String toString() {
        return "Car{" +
                "бренд='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", год производства=" + productionYears +
                ", страна производства='" + productionCountry + '\'' +
                ", цвет='" + color + '\'' +
                ", объем двигателя=" + engineVolume +
                '}';
    }
}



