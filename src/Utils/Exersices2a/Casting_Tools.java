package Utils.Exersices2a;

public class Casting_Tools {

    public static void performOperations(int integerNumber, double doubleNumber) {
        double intToDouble = integerNumber;
        System.out.println("Casting from int to double: " + intToDouble +
                " (Before: " + Integer.BYTES + " bytes, After: " + Double.BYTES + " bytes)");

        int doubleToInt = (int) doubleNumber;
        System.out.println("Casting from double to int: " + doubleToInt +
                " (Before: " + Double.BYTES + " bytes, After: " + Integer.BYTES + " bytes)");

        byte intToByte = (byte) integerNumber;
        System.out.println("Casting from int to byte: " + intToByte +
                " (Before: " + Integer.BYTES + " bytes, After: " + Byte.BYTES + " bytes)");

        float doubleToFloat = (float) doubleNumber;
        System.out.println("Casting from double to float: " + doubleToFloat +
                " (Before: " + Double.BYTES + " bytes, After: " + Float.BYTES + " bytes)");

        System.out.println();
    }
}
