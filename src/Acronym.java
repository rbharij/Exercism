public class Acronym {

    String TexttoCheck = "";

    public Acronym(String Phrase) {
        //Replace any hyphens with spaces
        Phrase = Phrase.replaceAll("-", " ");
        //Split the phrase into an Array by finding the spaces
        String[] letters = Phrase.split(" ");
        // Extract the first letter of each word and add that to the return phrase
        for(int i=0;i<letters.length;i++){
            //Get the first letter
            String A = letters[i].substring(0,1);
            TexttoCheck = TexttoCheck + A;
        }
    }

    public String get() {

        return TexttoCheck.toUpperCase();
    }
}
