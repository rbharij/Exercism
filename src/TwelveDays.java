public class TwelveDays {

    String VerseArray[] = new String[13];

    public String verse(int i) {

        SongArray();
        return VerseArray[i];

    }

    public String verses(int i, int i1) {
        String Song = "";
        SongArray();

        for (int num = 0; num <= i1; num++) {
            if (VerseArray[num] != null) {

                if (num == i1) {
                    Song = Song + VerseArray[num];
                } else {

                    Song = Song + VerseArray[num] + "\n";
                }
            }

        }
        return Song;
    }

    public String sing() {
        //return the whole song
        String Song = "";
        SongArray();

        for (int num = 1; num <= 12; num++) {
            if (VerseArray[num] != null) {

                if (num == 12) {
                    Song = Song + VerseArray[num];
                } else {

                    Song = Song + VerseArray[num] + "\n";
                }
            }

        }
        return Song;
    }


    public void SongArray() {

        VerseArray[1]  = "On the first day of Christmas my true love gave to me, " +
        "a Partridge in a Pear Tree.\n";

        VerseArray[2] = "On the second day of Christmas my true love gave to me, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";

        VerseArray[3] = "On the third day of Christmas my true love gave to me, three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n";

        VerseArray[4] = "On the fourth day of Christmas my true love gave to me, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

        VerseArray[5] = "On the fifth day of Christmas my true love gave to me, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

        VerseArray[6] = "On the sixth day of Christmas my true love gave to me, six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";

        VerseArray[7] = "On the seventh day of Christmas my true love gave to me, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n";

        VerseArray[8] = "On the eighth day of Christmas my true love gave to me, eight Maids-a-Milking," +
                " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

        VerseArray[9] = "On the ninth day of Christmas my true love gave to me, nine Ladies Dancing, " +
                "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

        VerseArray[10] = "On the tenth day of Christmas my true love gave to me, ten Lords-a-Leaping, " +
                "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";

        VerseArray[11] = "On the eleventh day of Christmas my true love gave to me, " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

        VerseArray[12] = "On the twelfth day of Christmas my true love gave to me, " +
                "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
                "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    }

}