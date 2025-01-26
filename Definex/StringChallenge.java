package Definex;

public class StringChallenge {
    public static String StringChallenge(String str) {
        if (str.length()==0) {
            return new String(String.valueOf(0));
        }


        StringBuilder result = new StringBuilder();
        
        Character previous = str.charAt(0);
        int counter = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == previous) {
                counter++;
            }
            else if (str.charAt(i) != previous) {
                result.append(counter+previous.toString());
                previous = str.charAt(i);
                counter = 1;
            }

            if(i == str.length()-1){
                System.out.println(counter + previous.toString());
                result.append(counter+previous.toString());

            }
        }
        return result.toString();
    }
}
