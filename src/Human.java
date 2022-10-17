public class Human {
    int birthDate;
    String name;
    String cityResidence;
    String function;
    //что то протупил с названием перепенной для работы, нужно было назвать job, но менять не стал

    Human(int birthDate, String name, String cityResidence, String function) {
        if (birthDate <= 0) {
            throw new IllegalArgumentException("Год рождения не может быть отрицательным или равен 0");
        } else {
            this.birthDate = birthDate;
        }
        //Делал проверку на null и на не указанное значение, подумал так правильнее
        if (name == null || name == "") {
            this.name = "(Информация не указана)";
        } else {
            this.name = name;
        }

        if (cityResidence == null || cityResidence == "") {
            this.cityResidence = "(Информация не указана)";
        } else {
            this.cityResidence = cityResidence;
        }

        if (function == null || function == "") {
            this.function = "(Информация не указана)";
        } else {
            this.function = function;
        }
    }

    void hey() {
        System.out.println("Привет! Меня зовут " + name + ", я из города " + cityResidence + ", я родился в " + birthDate + " году. Я работаю на должности " + function + ". Будем знакомы!");
    }
}
