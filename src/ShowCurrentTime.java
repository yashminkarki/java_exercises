public class ShowCurrentTime {
    public static void main(String[] args)
    {
        long totalMilliSecond = System.currentTimeMillis();
        System.out.println(totalMilliSecond);
        long totalSeconds = totalMilliSecond/1000;
        System.out.println(totalSeconds);
        long currentSeconds = totalSeconds % 60;
        System.out.println(currentSeconds);
        long totalMinutes = totalSeconds/60;
        System.out.println(totalMinutes);
        long currentMinutes = totalMinutes % 60;
        System.out.println(currentMinutes);
        long totalHours = totalMinutes/60;
        System.out.println(totalHours);  //450140
        long currentHours = totalHours % 24;
        System.out.println(currentHours);
        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}

