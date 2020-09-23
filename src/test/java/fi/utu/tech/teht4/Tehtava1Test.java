package fi.utu.tech.teht4;

import fi.utu.tech.teht1.Tehtava;
import net.jqwik.api.*;

public class Tehtava1Test {

    Tehtava t = new Tehtava();



    /*Tehtävä 1A*/

    @Provide
    Arbitrary<int[]> intArrayA_True() {
        Arbitrary<Integer> num = Arbitraries.integers().greaterOrEqual(1);
        return num.array(int[].class).ofMinSize(5).ofMaxSize(10);
    }
    @Provide
    Arbitrary<int[]> intArrayA_False() {
        Arbitrary<Integer> num = Arbitraries.integers().lessOrEqual(1);
        return num.array(int[].class).ofMinSize(5).ofMaxSize(10);
    }

    @Property boolean testA_True(@ForAll("intArrayA_True") int[] arr){
        return t.onKiva(arr);
    }
    @Property boolean testA_False(@ForAll("intArrayA_False") int[] arr){
        return t.onKiva(arr);
    }

    /*Tehtävä 1B*/

    @Example
    boolean testB_TrueExample() {
        String str = "tässä on k kirjaimia";
        return t.sisaltaakoMerkin(str);
    }

    @Provide
    Arbitrary<String> stringB_False() {
        return Arbitraries.strings().withCharRange('a', 'z').ofMinLength(5).ofMaxLength(10);
    }


    @Property boolean testB_False(@ForAll("stringB_False") String s){
        return t.sisaltaakoMerkin(s);
    }

    /*Tehtävä 1C*/

    @Example
    boolean testC_TrueExample() {
        int[] arr =  {3,2,2,4,5,6,7};
        return t.lottorivinMinimialkiollaDublikaatteja(arr);
    }


    @Provide
    Arbitrary<int[]> intArrayC() {
        Arbitrary<Integer> num = Arbitraries.integers().between(1,39);
        return num.array(int[].class).ofSize(7);
    }

    @Property boolean testC_False(@ForAll("intArrayC") int[] arr){
        return t.lottorivinMinimialkiollaDublikaatteja(arr);
    }
}


