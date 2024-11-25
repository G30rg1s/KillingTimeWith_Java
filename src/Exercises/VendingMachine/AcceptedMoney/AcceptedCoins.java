package Exercises.VendingMachine.AcceptedMoney;

public class AcceptedCoins {
    private SingleCoin[] coins;

    public AcceptedCoins() {
        coins = new SingleCoin[]{
                new SingleCoin("Ten Cent", 0.10),
                new SingleCoin("Twenty Cent", 0.20),
                new SingleCoin("Fifty Cent", 0.50),
                new SingleCoin("One Euro", 1.00),
                new SingleCoin("Two Euro", 2.00)
        };
    }

    public SingleCoin[] getCoins() {
        return coins;
    }

    public void printAcceptedCoins() {
        System.out.println("\nAccepted Coins:");
        for (SingleCoin coin : coins) {
            coin.printCoinDetails();
        }
    }
}

