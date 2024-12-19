package week12;

import java.util.HashMap;

public class reformatDate {
    public String reformatDate(String date) {
        String time [] = date.split(" ");
        HashMap<String, String> convertToMonth = new HashMap<>();

        convertToMonth.put("Jan", "01");
        convertToMonth.put("Feb", "02");
        convertToMonth.put("Mar", "03");
        convertToMonth.put("Apr", "04");
        convertToMonth.put("May", "05");
        convertToMonth.put("Jun", "06");
        convertToMonth.put("Jul", "07");
        convertToMonth.put("Aug", "08");
        convertToMonth.put("Sep", "09");
        convertToMonth.put("Oct", "10");
        convertToMonth.put("Nov", "11");
        convertToMonth.put("Dec", "12");

        String day = time[0].substring(0, time[0].length() - 2);
        String month = time[1];
        String year = time[2];

        if (Integer.parseInt(day) < 10) {
            day = "0" + day;
        }

        String result = year + '-' + convertToMonth.get(month) + "-" + day;

        return result;
    }
}
