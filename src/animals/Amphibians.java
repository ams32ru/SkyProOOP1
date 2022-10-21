package animals;

import java.util.Objects;

public class Amphibians extends Animals{

    private  final String livingEnvironment;

    public Amphibians(String name, int yearsOld, String livingEnvironment) {
        super(name, yearsOld);
        this.livingEnvironment = livingEnvironment;
    }

    public String hunts() {
        return "Выждать и напасть";
    }

    @Override
    public String eat() {
        return "Проглотить живьем";
    }

    @Override
    public String sleep() {
        return "Как спят амфибии хз";
    }

    @Override
    public String move() {
        return "Прыгают, ползают, плавают";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString()+
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
}
