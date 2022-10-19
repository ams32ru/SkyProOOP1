package transport;

import java.awt.*;
import java.time.LocalDate;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int productionYears;
    private String productionCountry;
    private String color;
    private float engineVolume;

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int seats;
    private String tires;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, int productionYears, String productionCountry, String color, float engineVolume,
               String transmission, String bodyType, String registrationNumber, int seats, String tires, Key key, Insurance insurance) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYears <= 0) {
            this.productionYears = 2000;
        } else {
            this.productionYears = productionYears;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        this.setColor(color);
        this.setEngineVolume(engineVolume);
        this.setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        this.setRegistrationNumber(registrationNumber);
        if (seats <= 0) {
            this.seats = 5;
        } else {
            this.seats = seats;
        }
        this.setTires(tires);
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    //оставлю 2 конструктора, старый и новый
    public Car(String brand, String model, int productionYears, String productionCountry, String color, float engineVolume) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYears <= 0) {
            this.productionYears = 2000;
        } else {
            this.productionYears = productionYears;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYears() {
        return productionYears;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public String getTires() {
        return tires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTires(String tires) {
        if (tires == null || tires.isBlank() || tires.isEmpty()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYears=" + productionYears +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seats=" + seats +
                ", tires='" + tires + '\'' +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYears == car.productionYears && Float.compare(car.engineVolume, engineVolume) == 0 && seats == car.seats && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(productionCountry, car.productionCountry) && Objects.equals(color, car.color) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(tires, car.tires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYears, productionCountry, color, engineVolume, transmission, bodyType, registrationNumber, seats, tires);
    }

    public void changeTires() {
        if (tires.equals("winter")) {
            this.tires = "summer";
        } else if (tires.equals("summer")) {
            this.tires = "winter";
        } else {
            this.tires = "winter";
        }
    }

    public boolean isCorrectRegNumber() {
//        х000хх000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public static class Insurance {
        private final LocalDate expireDay;
        private final int cost;
        private final String number;

        public Insurance() {
            this(null, 10000, null);
        }

        public Insurance(LocalDate expireDay, int cost, String number) {
            if (expireDay == null) {
                this.expireDay = LocalDate.now().plusDays(365);
            } else {
                this.expireDay = expireDay;
            }
            this.cost = cost;
            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "expireDay=" + expireDay +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }

        public LocalDate getExpireDay() {
            return expireDay;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDay() {
            if (expireDay.isBefore(LocalDate.now()) || expireDay.isEqual(LocalDate.now())) {
                System.out.println("Нужно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некоректный");
            }
        }
    }
}



