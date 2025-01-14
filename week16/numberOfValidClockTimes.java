package week16;

public class numberOfValidClockTimes {
    public int countTime(String time) {
        String[] parts = time.split(":");
        String hours = parts[0];
        String minutes = parts[1];
        
        int validHours = countValidHours(hours);
        int validMinutes = countValidMinutes(minutes);
        
        return validHours * validMinutes;
    }

    private int countValidHours(String hours) {
        if (!hours.contains("?")) {
            int hour = Integer.parseInt(hours);
            return (hour >= 0 && hour <= 23) ? 1 : 0;
        }
        
        if (hours.equals("??")) {
            return 24; //00-23
        }
        
        if (hours.charAt(0) == '?') {
            int secondDigit = hours.charAt(1) - '0';
            if (secondDigit >= 4) {
                return 2; //0, 1
            }
            return 3; //0, 1, 2
        }
        
        int firstDigit = hours.charAt(0) - '0';
        if (firstDigit > 2) {
            return 0;
        }
        if (firstDigit == 2) {
            return 4; //0-3
        }
        return 10; //0-9
    }
    
    private int countValidMinutes(String minutes) {
        if (!minutes.contains("?")) {
            int minute = Integer.parseInt(minutes);
            return (minute >= 0 && minute <= 59) ? 1 : 0;
        }
        
        if (minutes.equals("??")) {
            return 60; //00-59
        }
        
        if (minutes.charAt(0) == '?') {
            return 6; //0-5
        }
        
        int firstDigit = minutes.charAt(0) - '0';
        if (firstDigit > 5) {
            return 0;
        }
        return 10; //0-9
    }
}
