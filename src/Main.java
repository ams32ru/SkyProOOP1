import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(35, "Максим", "Минск", "Бренд - менеджер");
        Human anya = new Human(29, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(27, "", "", null);
        Human vladimir = new Human(21, "Владимир", "Казань", null);

        artem.hey();
        anya.hey();
        vladimir.hey();
        katya.hey();
        maksim.hey();
        System.out.println();

        Car lada = new Car(null, "Granta", 0, "", "желтый", 3.0f, null, null, null, 0, null, null, new Car.Insurance(), 122);
        Car audi = new Car("audi", "A8 50 L TDI quattro", 2022, "Germane", "желтый", 3.0f, null, null, null, 0, null, null, new Car.Insurance(), 221);
        Car bmw = new Car("BMW", "Z9", 2021, "Germane", "черный", 3.0f, null, null, null, 0, null, new Car.Key(), null, 0);
        Car kia = new Car("Kia", "Sportage 4", 2018, "South Korea", "красный", 2.4f, null, null, null, 0, null, new Car.Key(), new Car.Insurance(), 231);
        Car hyundai = new Car("Hyundai", "Avente", 2016, "South Korea", "оранжевый", 1.6f, null, null, null, 0, null, null, null, 144);
        Car lada2 = new Car(null, "Granta", 0, "", "", 0, null, "", null, 0, null, null, new Car.Insurance(), 322);
        System.out.println("lada.toString() = " + lada.toString());
        System.out.println("kia.toString() = " + kia.toString());
        System.out.println("lada2.toString() = " + lada2.toString());

        Flower roza = new Flower(null, "Голандия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15.00, 5);
        Flower peony = new Flower(null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5, 10);

        System.out.println();
        System.out.println("roza.toString() = " + roza.toString());
        System.out.println("chrysanthemum.toString() = " + chrysanthemum.toString());
        System.out.println("peony.toString() = " + peony.toString());
        System.out.println("gypsophila.toString() = " + gypsophila.toString());

        lada2.changeTires();
        System.out.println("lada2.getTires() = " + lada2.getTires());
        lada2.changeTires();
        System.out.println("lada2.getTires() = " + lada2.getTires());

        System.out.println(lada.isCorrectRegNumber());
        System.out.println(lada2.isCorrectRegNumber());

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград - Пассажирский", 8);

        System.out.println("lastochka.toString() = " + lastochka.toString());
        System.out.println("leningrad.toString() = " + lastochka.toString());

        Bus bus1 = new Bus("Иж", "ЖиЖиЖ", 2020, "Россия", null, 122, 222);
        Bus bus2 = new Bus("МаЗ", "Т900", 2045, "Россия", null, 166, 46);

        System.out.println("bus1.toString() = " + bus1.toString());
        System.out.println("bus2.toString() = " + bus2.toString());

        leningrad.refill();
        audi.refill();
        bus1.refill();

    }


}






