package Exercises.Farmers;

import Utils.Exersices2a.Brown_Tools;
import Utils.Exersices2a.General_2a_Tools;

public class BrownEggs {
    public int eggsPerChicken;
    public int chickenCount;

    public BrownEggs(int eggsPerChicken, int chickenCount) {
        this.eggsPerChicken = eggsPerChicken;
        this.chickenCount = chickenCount;
        Brown_Tools.calculateBrownEggs(eggsPerChicken, chickenCount);
    }

    public BrownEggs() {
        this.eggsPerChicken = General_2a_Tools.getIntegerInput("How many eggs/day a single chicken gives during this period? :");
        this.chickenCount = General_2a_Tools.getIntegerInput("How many chickens farmer Brown owns this Monday? :");
        Brown_Tools.calculateBrownEggs(eggsPerChicken, chickenCount);
    }
}
