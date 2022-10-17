public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(2022 - 35, "Максим", "Минск", "Бренд - менеджер");
        Human anya = new Human(2022 - 29, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(2022 - 28, "Катя", "Калининград", "Продакт-менеджер");
        // Артема я тестил на значения по умолчанию
        Human artem = new Human(2027 - 27, "", "", null);

        // в этом классе сделал вывод методом а в классе Car переопределил toString, не знаю как правильнее
        artem.hey();
        anya.hey();

        //ладу тоже как тест оставил
        Car lada = new Car(null, "Granta", 0, "", "", 0);
        Car audi = new Car("audi", "A8 50 L TDI quattro", 2022, "Germane", "желтый", 3.0f);
        Car bmw = new Car("BMW", "Z9", 2021, "Germane", "черный", 3.0f);
        Car kia = new Car("Kia", "Sportage 4", 2018, "South Korea", "красный", 2.4f);
        Car hyundai = new Car("Hyundai", "Avente", 2016, "South Korea", "оранжевый", 1.6f);

        System.out.println("lada.toString() = " + lada.toString());
        System.out.println("kia.toString() = " + kia.toString());


    }
}






