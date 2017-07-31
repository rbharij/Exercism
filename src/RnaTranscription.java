public class RnaTranscription {
    public String transcribe(String s) {
        //Build an Array of the Chars in the passed in string
        char arr[]=s.toCharArray();
        //Intialise a new variables
        String transcribedstring = "";
        //For each Char is the array get its corresponding char (DNA>RNA)
        for(int i=0;i<arr.length;i++){
            //Build the transcrbed sequence
            switch (arr[i]) {
                case 'A': transcribedstring = transcribedstring + "U";
                    break;
                case 'C': transcribedstring = transcribedstring + "G";
                    break;
                case 'G': transcribedstring = transcribedstring + "C";
                    break;
                case 'T': transcribedstring = transcribedstring + "A";
                    break;
                default : transcribedstring = "";
            }
        }
        System.out.println("DNA sequence [" + s + "] transcribed to RNA sequence [" + transcribedstring + "]");
        return transcribedstring ;
    }
}
