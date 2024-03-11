package _09_Polymorphism._04_WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;

    protected Mammal(String animalType,
                  String animalName,
                  Double animalWeight,
                  String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        return String.format("%s[%s, %s, %s, %d]",
                this.animalType,
                this.animalName,
                decimalFormat.format(this.animalWeight),
                this.getLivingRegion(),
                this.foodEaten);
    }
}
