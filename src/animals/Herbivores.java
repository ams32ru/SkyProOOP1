package animals;

import java.util.Objects;

public class Herbivores  extends Mammals{
    private  final String typeOfFood = "Раститиельная пища";

    public Herbivores(String name, int yearsOld, String livingEnvironment, String speed) {
        super(name, yearsOld, livingEnvironment, speed);
    }

    public String graze() {
        return "Пастись";
    }

    @Override
    public String eat() {
        return "Щипать травку";
    }

    @Override
    public String sleep() {
        return "Спать могут стоя или лежа";
    }

    @Override
    public String move() {
        return "Передвигаются обычно стадом";
    }

    @Override
    public String walk() {
        return "Скакать по лужку и полюшку";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Тип пищи: " + typeOfFood + '\'' +
                '}';
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
}
