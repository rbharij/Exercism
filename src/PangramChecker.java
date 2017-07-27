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
        // Method to determine if the text is a Pangram
        // Create an Array to hold the letters in the alphabet
        String myStringArray[];

        

        //The text is not a Pangram
        return false;
        //the Text is a Pangram
    }




}