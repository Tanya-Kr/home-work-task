package com.hillel.basic.exam;

/**
 * Polycarpus works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance.
 * Recently, he has decided to take a couple of old songs and make dubstep remixes from them.
 * <p>
 * Let's assume that a song consists of some number of words. To make the dubstep remix of this song,
 * Polycarpus inserts a certain number of words "WUB" before the first word of the song (the number may be zero),
 * after the last word (the number may be zero), and between words (at least one between any pair of neighbouring words),
 * and then the boy glues together all the words, including "WUB", in one string and plays the song at the club.
 * <p>
 * For example, a song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX"
 * and cannot transform into "WUBWUBIAMWUBX".
 * <p>
 * Recently, Jonny has heard Polycarpus's new dubstep track, but since he isn't into modern music,
 * he decided to find out what was the initial song that Polycarpus remixed. Help Jonny restore the original song.
 * <p>
 * Input
 * The input consists of a single non-empty string, consisting only of uppercase English letters, the string's length
 * doesn't exceed 200 characters
 * <p>
 * Output
 * Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.
 */

public class Dubster {

    public static String songDecoder(String song) {
//<<<<<<< HEAD

        String result = song.replace("WUB", " ");
        result = result.trim().replaceAll("[\\s]{2,}", " ");
        return result;

//=======
//        String result = song.replaceAll("WUBWUBWUB", " ")
//                .replaceAll("WUB", " ");
////                .replaceAll("  ", " ");
//        return result.trim();
//>>>>>>> upstream/master
    }
}
