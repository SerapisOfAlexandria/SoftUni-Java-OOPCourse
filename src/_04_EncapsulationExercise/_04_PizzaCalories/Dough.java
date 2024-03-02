//package _04_EncapsulationExercise._04_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        List<String> flourTypes = new ArrayList<>(List.of("White", "Wholegrain"));
        if (!flourTypes.contains(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        List<String> bakingTechniques = List.of("Crispy", "Chewy", "Homemade");
        if (!bakingTechniques.contains(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double modifierFlourType = 0;
        double modifierBakingTechnique = 0;
        switch (this.flourType) {
            case "White":
                modifierFlourType = 1.5;
                break;
            case "Wholegrain":
                modifierFlourType = 1.0;
                break;
        }
        switch (this.bakingTechnique) {
            case "Crispy":
                modifierBakingTechnique = 0.9;
                break;
            case "Chewy":
                modifierBakingTechnique = 1.1;
                break;
            case "Homemade":
                modifierBakingTechnique = 1.0;
                break;
        }
        return (this.weight * 2) * modifierBakingTechnique * modifierFlourType;
    }
}
