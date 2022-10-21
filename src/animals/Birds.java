package animals;

import java.util.Objects;

  abstract class Birds extends Animals {
    private final String livingEnvironment;

    public Birds(String name, int yearsOld, String livingEnvironment) {
        super(name, yearsOld);
        this.livingEnvironment = livingEnvironment;
    }


    public String hunts() {
        return "Спикировать и схватить";
    }

    @Override
    public String eat() {
        return "Клевать";
    }

    @Override
    public String sleep() {
        return "Спать на ветке иил гнезде";
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Среда обитания " + livingEnvironment +
                '\'' +
                '}';
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
}
