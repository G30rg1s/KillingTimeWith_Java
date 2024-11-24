package Exercises;

import Utils.Exersices2a.Casting_Tools;
import Utils.Exersices2a.General_2a_Tools;

public class Casting {
    public int integerNumber;
    public double doubleNumber;

    public Casting(int integerNumber, double doubleNumber) {
        this.integerNumber = integerNumber;
        this.doubleNumber = doubleNumber;
        Casting_Tools.performOperations(integerNumber, doubleNumber);
    }

    public Casting() {
        this.integerNumber = General_2a_Tools.getIntegerInput("Enter an integer number: ");
        this.doubleNumber = General_2a_Tools.getDoubleInput("Enter a double number: ");
        Casting_Tools.performOperations(integerNumber, doubleNumber);
    }
}
