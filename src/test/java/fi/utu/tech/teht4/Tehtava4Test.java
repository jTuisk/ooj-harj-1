package fi.utu.tech.teht4;

import fi.utu.tech.teht1.Tehtava;
import net.jqwik.api.*;
import org.junit.jupiter.api.*;

public class Tehtava4Test {

    Tehtava t = new Tehtava();

    /*Tehtävä 1A*/

    @Provide
    Arbitrary<int[]> intArrayA_True() {
        Arbitrary<Integer> num = Arbitraries.integers().greaterOrEqual(1);
        return num.array(int[].class).ofMinSize(5).ofMaxSize(10);
    }
    @Provide
    Arbitrary<int[]> intArrayA_False() {
        Arbitrary<Integer> num = Arbitraries.integers().lessOrEqual(0);
        return num.array(int[].class).ofMinSize(5).ofMaxSize(10);
    }


    @Property boolean testA_True(@ForAll("intArrayA_True") int[] arr){
        return t.onKiva(arr);
    }
    @Property boolean testA_False(@ForAll("intArrayA_False") int[] arr){
        return !t.onKiva(arr);
    }

    /*Tehtävä 1B*/

    @Provide
    Arbitrary<String> stringB_True() {
        return Arbitraries.strings().withChars('k').ofLength(5);
    }

    @Provide
    Arbitrary<String> stringB_False() {
       return Arbitraries.strings().withCharRange('a', 'j').ofMinLength(5).ofMaxLength(20);
    }

    @Property boolean testB_True(@ForAll("stringB_True") String s){
        return t.sisaltaakoMerkin(s);
    }

    @Property boolean testB_False(@ForAll("stringB_False") String s){
        return !t.sisaltaakoMerkin(s);
    }

    /*Tehtävä 1C*/

    @Provide
    Arbitrary<int[]> intArrayC_True() {
        Arbitrary<Integer> num = Arbitraries.integers().between(5,5);
        return num.array(int[].class).ofSize(7);
    }

    @Provide
    Arbitrary<int[]> intArrayC_False() {
        Arbitrary<Integer> num = Arbitraries.integers().between(1,39);
        return num.array(int[].class).ofSize(3);
    }

    @Property boolean testC_True(@ForAll("intArrayC_True") int[] arr){
        return t.lottorivinMinimialkiollaDublikaatteja(arr);
    }
    @Property boolean testC_False(@ForAll("intArrayC_False") int[] arr){
        return !t.lottorivinMinimialkiollaDublikaatteja(arr);
    }
}


