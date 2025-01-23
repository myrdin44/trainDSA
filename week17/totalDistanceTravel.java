package week17;

public class totalDistanceTravel {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalDistance = 0;
        
        while (mainTank >= 5 && additionalTank > 0) {
            totalDistance += 50;
            mainTank -= 4;
            additionalTank -= 1;
        }

        totalDistance += 10 * mainTank;

        return totalDistance;

    }
}
