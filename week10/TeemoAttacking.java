package week10;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }

        int totalPoisonedTime = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int currentEndTime = timeSeries[i] + duration;
            if (timeSeries[i + 1] < currentEndTime) {
                totalPoisonedTime += timeSeries[i + 1] - timeSeries[i];
            } else {
                totalPoisonedTime += duration;
            }
        }

        totalPoisonedTime += duration;

        return totalPoisonedTime;
    }
}
