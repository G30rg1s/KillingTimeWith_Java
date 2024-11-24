package Utils.Exersices2a;

public class Fred_Tools {

    private static int averageEggsOfThreeDaysData(int eggsDay1, int eggsDay2, int eggsDay3) {
        return (eggsDay1 + eggsDay2 + eggsDay3) / 3;
    }

    public static void calculateFredProfit(int mondayEggs, int tuesdayEggs, int wednesdayEggs) {
        double dailyAverage = averageEggsOfThreeDaysData(mondayEggs, tuesdayEggs, wednesdayEggs);

        int daysInMonth30 = 30;
        double monthlyAverage30 = dailyAverage * daysInMonth30;

        int daysInMonth31 = 31;
        double monthlyAverage31 = dailyAverage * daysInMonth31;

        double adjustedMonthlyAverage = (monthlyAverage30 + monthlyAverage31) / 2;

        double eggProfit = 0.18;
        double monthlyProfit = adjustedMonthlyAverage * eggProfit;

        System.out.println("Eggs collected on Monday: " + mondayEggs);
        System.out.println("Eggs collected on Tuesday: " + tuesdayEggs);
        System.out.println("Eggs collected on Wednesday: " + wednesdayEggs);
        System.out.println("Daily average number of eggs: " + String.format("%.2f", dailyAverage));
        System.out.println("Projected monthly average number of eggs (adjusted): " + String.format("%.2f", adjustedMonthlyAverage));
        System.out.println("Projected monthly average profit: €" + String.format("%.2f", monthlyProfit));
    }
}

