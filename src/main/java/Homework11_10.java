import java.util.Scanner;

public class Homework11_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Actual time (only hours) : ");
        int time_hours = scanner.nextInt();
        System.out.println("Actual time (only minutes): ");
        int time_minutes = scanner.nextInt();
        int time_hours_left = 17 - time_hours;
        int time_minutes_left = (time_hours_left * 60) - time_minutes;
        int time_seconds_left = time_minutes_left * 60;


        if( time_hours >= 9 && time_hours <16) {
            System.out.println(time_hours_left - 1);
            System.out.println(time_minutes_left);
            System.out.println(time_seconds_left);
        } else if (time_hours == 16 && time_minutes == 0 ) {
            System.out.println(time_hours_left);
            System.out.println(time_minutes_left);
            System.out.println(time_seconds_left);
        } else if (time_hours >= 16 && time_hours < 17 && time_minutes != 0) {
            System.out.println(time_hours_left - 1);
            System.out.println(time_minutes_left);
            System.out.println(time_seconds_left);
        } else {
            System.out.println("Not working hours");
        }
        scanner.close();
    }
}
