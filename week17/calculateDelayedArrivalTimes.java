package week17;

public class calculateDelayedArrivalTimes {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int takeOffTime = -1;

        if ((arrivalTime + delayedTime) % 24 == 0) {
            takeOffTime = 0;
        } else {
            takeOffTime = (arrivalTime + delayedTime) % 24;
        }

        return takeOffTime;
    }
}
