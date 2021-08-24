public class TimeCrunch {

    /*
    Create a p rogram which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int rawSeconds= 3666;
        int totalSeconds = 3666;
        int numHours = totalSeconds/3600;
         totalSeconds= totalSeconds%3600;
         int numMinutes= totalSeconds/60;
         int numSeconds=totalSeconds%60;
        System.out.println("Total seconds: "+rawSeconds);
        System.out.println("hours: "+numHours );
        System.out.println("minutes: "+numMinutes);
        System.out.println("seconds: "+numSeconds);












    }








}
