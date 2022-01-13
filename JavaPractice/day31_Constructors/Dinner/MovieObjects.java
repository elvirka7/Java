package day31_Constructors.Dinner;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021", "Kuzzat Altay");
        movie.addCast("Asiya");
        String[] casts = {"Adam", "Muhtar", "Aizada", "Kseniia", "Cemil", "Ozge", "Omer"};
        movie.addCasts(casts);
        System.out.println(movie);



    }

    public static ArrayList<Integer> test(ArrayList<Integer> list){
        return list;
    }


}

