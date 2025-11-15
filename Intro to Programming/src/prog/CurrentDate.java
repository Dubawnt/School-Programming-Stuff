package prog;
import java.text.SimpleDateFormat;

public class CurrentDate {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
        String output = date.format(time);
        int monthInt = Integer.parseInt(output.substring(0, 2));
        String dayYear = output.substring(3);
        String month = "";
        switch (monthInt){
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
        }
        String finalOutput = month + " " + dayYear;
        System.out.println("The current date is " + finalOutput);
    }
}
