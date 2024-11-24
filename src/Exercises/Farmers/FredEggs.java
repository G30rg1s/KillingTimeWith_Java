package Exercises.Farmers;

import Utils.Exersices2a.Fred_Tools;
import Utils.Exersices2a.General_2a_Tools;

public class FredEggs {
    public int eggsDay1;
    public int eggsDay2;
    public int eggsDay3;

    public FredEggs(int eggsDay1, int eggsDay2, int eggsDay3) {
        this.eggsDay1 = eggsDay1;
        this.eggsDay2 = eggsDay2;
        this.eggsDay3 = eggsDay3;
        Fred_Tools.calculateFredProfit(eggsDay1, eggsDay2, eggsDay3);
    }

    public FredEggs() {
        this.eggsDay1 = General_2a_Tools.getIntegerInput("How many eggs Fred colected the first day? :");
        this.eggsDay2 = General_2a_Tools.getIntegerInput("How many eggs Fred colected the second day? :");
        this.eggsDay3 = General_2a_Tools.getIntegerInput("How many eggs Fred colected the third day? :");
        Fred_Tools.calculateFredProfit(eggsDay1, eggsDay2, eggsDay3);
    }
}

