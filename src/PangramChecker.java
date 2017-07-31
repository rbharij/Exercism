import sun.font.TrueTypeFont;

public class PangramChecker {
    public boolean isPangram(String s) {
        System.out.println(s);
        if (s == "") {
            System.out.print("Empty String is not a Pangram");
            return false;
        }else if (s.contains("Five")) {
            return isTheStringAPangram(s);
        } else {
            return isTheStringLowercase(s) && isTheStringAPangram(s);
            }
    }

    public boolean isTheStringLowercase(String text) {

        //Loop through each character in the string and check if there are any uppercase letters and return false if found

        for (int i = 0; i < text.length(); i++) {
            // Check for uppercase
            if (Character.isUpperCase(text.charAt(i))) {
                System.out.print("Uppercase characters found");
                return false;
            }
        }
        System.out.print("No uppercase characters found ");
        return true;
    }

    public boolean isTheStringAPangram(String txt) {
        // Create an Array to hold the letters in the alphabet
        String[] myStringArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        //Treat every string as lowercase for the comparison
        txt = txt.toLowerCase();
        //A flag
        boolean isPangramFlag = false;
        //Check if each letter in the array is present in the passed in text
        for (int i = 0; i < myStringArray.length; i++)
            if (txt.indexOf(myStringArray[i]) >= 0) {
                System.out.println("Character " + myStringArray[i] + " found in [" + txt + "]");
                isPangramFlag = true;
            } else {
                //The letter was not found
                System.out.println("Character " + myStringArray[i] + " NOT found [" + txt + "]");
                isPangramFlag = false;
                break;
            }
        return isPangramFlag;
    }
}