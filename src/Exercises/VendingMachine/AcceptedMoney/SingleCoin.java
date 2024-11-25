package Exercises.VendingMachine.AcceptedMoney;

public class SingleCoin {
    private String name;   // Όνομα του νομίσματος (π.χ., "Ten Cent")
    private double value;  // Αξία του νομίσματος (π.χ., 0.10)

    public SingleCoin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void printCoinDetails() {
        System.out.println("Coin: " + name + ", Value: €" + String.format("%.2f", value));
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}

