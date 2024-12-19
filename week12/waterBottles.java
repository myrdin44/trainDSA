package week12;

public class waterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;

        // tinh so chai uong duoc
        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }

        return totalBottles;
    }
}