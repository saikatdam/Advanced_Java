public class sumOfTwoTime {
    public static void main(String[] args) {
        // Time 1: 2 hours, 30 minutes, 45 seconds
        int hours1 = 2;
        int minutes1 = 30;
        int seconds1 = 45;

        // Time 2: 1 hour, 45 minutes, 20 seconds
        int hours2 = 1;
        int minutes2 = 45;
        int seconds2 = 20;

        // Calculate total seconds for each time
        int totalSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1;
        int totalSeconds2 = hours2 * 3600 + minutes2 * 60 + seconds2;

        // Calculate total seconds for sum
        int totalSumSeconds = totalSeconds1 + totalSeconds2;

        // Convert total seconds to hours, minutes, and seconds
        int sumHours = totalSumSeconds / 3600;
        int remainingSeconds = totalSumSeconds % 3600;
        int sumMinutes = remainingSeconds / 60;
        int sumSeconds = remainingSeconds % 60;

        // Display the sum
        System.out.println("Sum of times: " + sumHours + " hours, " + sumMinutes + " minutes, " + sumSeconds + " seconds");
    }
}
