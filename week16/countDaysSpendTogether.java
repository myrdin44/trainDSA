package week16;

public class countDaysSpendTogether {
    private int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceStart = convertToDay(arriveAlice);
        int aliceEnd = convertToDay(leaveAlice);
        int bobStart = convertToDay(arriveBob);
        int bobEnd = convertToDay(leaveBob);
        
        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);
        
        return Math.max(0, end - start + 1);
    }
    private int convertToDay(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));
        
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        
        return totalDays;
    }
}
