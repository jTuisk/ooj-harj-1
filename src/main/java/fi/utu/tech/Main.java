package fi.utu.tech;

import fi.utu.tech.teht4.*;
import java.util.Arrays;

public class Main {
    /**
     * Main class.
     * @param args Command line arguments
     */
    static int[][] toArr = {    {0,0,0,0,0},
                                {0,0,0,0,0},
                                {0,1,0,0,0},
                                {0,0,0,0,0},
                                {0,0,0,0,0}};
    static int[][] fromArr = {  {1,1,1},
                                {1,1},
                                {1}};



    public static void main(String[] args) {
        Tehtava t3 = new Tehtava();

        System.out.println(t3.updatedValidArea(toArr, fromArr, new Position(2,1)));
        for(int i = 0; i < toArr.length; i++){
            System.out.println(Arrays.toString((toArr[i])));
        }
    }



}
