
public class CreditCard {

    static int checkDigit;
    static Integer ccCalculation[] = new Integer [16];

    public static String check(String s) {
        moveToArray(s);
        checkDigit = ccCalculation[15];
        timesTwo();
        theHairyPart();
        int finalNum = accumulate() +checkDigit;
        return isMultipleOfTen(finalNum) ? "Valid Credit Card" :  "Invalid Credit Card";
    }

    private static boolean isMultipleOfTen(int finalNum) {
        return finalNum%10==0;
    }

    private static int accumulate() {
        int totalOfNumbers = 0;
        for (int n=0;n<ccCalculation.length-1;n++){
            totalOfNumbers = (totalOfNumbers + ccCalculation[n]);
        }
        return totalOfNumbers;
    }

    private static void theHairyPart() {
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
    }

    private static void timesTwo() {
        for (int n=0;n<ccCalculation.length;n+=2){
            ccCalculation[n] = (ccCalculation[n] *2 );
        }
    }

    public static void moveToArray(String s){
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

