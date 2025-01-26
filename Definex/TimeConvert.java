package Definex;

public class TimeConvert{
    public static String StringChallenge(int num) {
        StringBuilder result = new StringBuilder();
        
        if (0<=num && num<=59) {result.append("0:"+num);}
        if (60<=num) {
            int hours = num / 60;
            int minutes = num % 60;
            result.append(hours+":"+minutes);
        }

        // code goes here  
        return result.toString();
        
    }

}