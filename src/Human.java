import java.time.LocalDate;

public class Human {
    private int birthDate;
    String name;
    private String cityResidence;
    String function;
    //что то протупил с названием перепенной для работы, нужно было назвать job, но менять не стал

    Human(int birthDate, String name, String cityResidence, String function) {

        if (birthDate < 0) {
            this.birthDate = 0;
        } else {
            this.birthDate = LocalDate.now().getYear() - birthDate;
        }
        if (cityResidence == null || cityResidence.isEmpty() || cityResidence.isBlank()) {
            this.cityResidence = "(Информация не указана)";
        } else {
            this.cityResidence = cityResidence;
        }
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "(Информация не указана)";
        } else {
            this.name = name;
        }
        if (function == null || function.isEmpty() || function.isBlank()) {
            this.function = "(Информация не указана)";
        } else {
            this.function = function;
        }
    }
    public int getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(int birthDate) {
        if (birthDate < 0) {
            this.birthDate = 0;
        } else {
            this.birthDate = LocalDate.now().getYear() - birthDate;
        }
    }
    public String getCityResidence() {
        return cityResidence;
    }

    public void setCityResidence(String cityResidence) {
        if (cityResidence == null || cityResidence.isEmpty() || cityResidence.isBlank()) {
            this.cityResidence = "(Информация не указана)";
        } else {
            this.cityResidence = cityResidence;
        }
    }
    void hey() {
        System.out.println("Привет! Меня зовут " + name + ", я из города " + cityResidence + ", я родился в " + birthDate + " году. Я работаю на должности " + function + ". Будем знакомы!");
    }
}
