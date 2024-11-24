package Utils.Exersices2a;

public class Brown_Tools {

    public static void calculateBrownEggs(int eggsPerChicken, int chickenCount) {
        System.out.println("Calculating farmer's Brown eggs with eggsPerChicken = " + eggsPerChicken
                + ", chickenCount = " + chickenCount);

        int mondayEggs = chickenCount * eggsPerChicken;

        chickenCount += 1;
        int tuesdayEggs = chickenCount * eggsPerChicken;

        chickenCount /= 2;
        int wednesdayEggs = chickenCount * eggsPerChicken;
        int totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;

        System.out.println("Eggs collected on Monday: " + mondayEggs);
        System.out.println("Eggs collected on Tuesday: " + tuesdayEggs);
        System.out.println("Eggs collected on Wednesday: " + wednesdayEggs);
        System.out.println("Total eggs collected from Monday to Wednesday: " + totalEggs);
        System.out.println();
    }
}
