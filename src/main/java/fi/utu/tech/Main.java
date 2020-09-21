package fi.utu.tech;

import fi.utu.tech.fizzbuzz.FizzBuzz;
import fi.utu.tech.teht3.*;

public class Main {
    /**
     * Main class.
     * @param args Command line arguments
     */
    static int[][] toArr = {    {0,0,0,0,0},
                                {0,0,0,0,0},
                                {0,0,0,0,0},
                                {0,0,0,0,0},
                                {0,0,0,0,0}};
    static int[][] fromArr = {  {1,1,1},
                                {1,1},
                                {1}};



    public static void main(String[] args) {
        Tehtava t3 = new Tehtava();

        System.out.println(t3.updatedValidArea(toArr, fromArr, new Position(1,1)));
    }
}
