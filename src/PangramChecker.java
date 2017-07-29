import sun.font.TrueTypeFont;

public class PangramChecker {
    public boolean isPangram(String s) {

        if (s == "")
            //No string passed - not a Pangram
            return false;
        else
            // First check if the string is all in lowercase
            return isTheStringLowercase(s);
    }

    public boolean isTheStringLowercase (String text) {

        //Loop through each character in the string and check if there are any uppercase letters and return false if found

        for (int i = 0; i<text.length();i++)
        {
            // Check for uppercase
            if (Character.isUpperCase(text.charAt(i)))
            {
                System.out.print("Uppercase characters found");
                return false;
            }
        }
        System.out.print("No uppercase characters found");
        return true;
    }

    public boolean isTheStringAPangram(String txt){
        // Create an Array to hold the letters in the alphabet
        String[] myStringArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        //A flag
        boolean isPangramFlag;
        isPangramFlag = false;
        //Check if each letter in the array is present in the passed in text
        for (int i = 0;  myStringArray.length; i++)
        {
            // Check if the current letter is within the string
            if (txt.indexOf(myStringArray[i]) > (0)) {
                System.out.print("Character " + myStringArray[i] + " found");
            } else {
                //The letter was not found so don't continue
            }
        }
        return isPangramFlag;
    }