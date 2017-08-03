import java.util.Arrays;
import java.util.stream.Collectors;

public class Acronym {

    private String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        //Replace any hyphens with spaces
        phrase = phrase.replaceAll("-", " ");
        //Split the phrase into an Array by finding the spaces
        String[] words = phrase.split(" ");
        // Extract the first letter of each word and add that to the return phrase
//        Arrays.asList(words)
//                .stream()
//                .map(w -> w.charAt(0))
//                .collect(Collectors.)
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            //Get the first letter
            sb.append(word.charAt(0));
        }

        return sb.toString().toUpperCase();
    }

}
