
public class CreditCard {

    int checkDigit;
    Integer ccCalculation[] = new Integer [16];

    public String check(String s) {
        //Move the String into an Array
        moveToArray(s);
        //Get the Check Digit (last Number in the Sequence)
        checkDigit = ccCalculation[15];
        //System.out.println("Check Digit is: " + checkDigit);
        //Starting with the first digit, multiple every second digit by 2
        for (int n=0;n<ccCalculation.length;n++){
            ccCalculation[n] = (ccCalculation[n] *2 );
            n++;
        }
        //Every time you have a two-digit number, just add those digits together for a one-digit result
        for (int n=0; n<ccCalculation.length;n++){
            if (ccCalculation[n]>9) {
                //Add the two numbers together
                int number=ccCalculation[n];
                int firstNum = (number/10);
                int secNum = (number%10);
                ccCalculation[n]= firstNum + secNum;
                //System.out.println(ccCalculation[n]);
            }
        }
        //Add all the numbers together
        int totalOfNumbers = 0;
        for (int n=0;n<ccCalculation.length-1;n++){
            totalOfNumbers = (totalOfNumbers + ccCalculation[n]);
        }
        //System.out.println("The total is:" + totalOfNumbers);
        //When this number is added to the check digit, then the result must be an even multiple of 10 and therefore a valid number
        int finalNum = totalOfNumbers+checkDigit;
        String validNum = "";
        if (finalNum%10==0) {
            //System.out.println(finalNum);
            validNum = "Valid Credit Card";
        } else {
            validNum = "Invalid Credit Card";
        }
        System.out.println(validNum);
        return validNum;
    }

    public  void moveToArray(String s){
        //Remove all Spaces and dashes
        s= s.replace(" ", "");
        s= s.replace("-", "");
        //Store all the numbers into an array
        for(int n=0;n<16;n++){
            //Get the first number and place it into the array
            ccCalculation[n] = Character.getNumericValue(s.charAt(n));
            //System.out.println(ccCalculation[n]);
        }

    }

}

