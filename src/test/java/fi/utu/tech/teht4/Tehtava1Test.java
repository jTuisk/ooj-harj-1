package fi.utu.tech.teht4;

import fi.utu.tech.teht1.Tehtava;
import net.jqwik.api.*;
import net.jqwik.api.arbitraries.StreamableArbitrary;

public class Tehtava1Test {

    Tehtava t = new Tehtava();

    @Provide
    Arbitrary<int[]> intArrayA() {
        Arbitrary<Integer> num = Arbitraries.integers().between(1,100);
        return num.array(int[].class).ofMinSize(1).ofMaxSize(20);
    }

    @Provide
    Arbitrary<String> stringB() {
        return Arbitraries.strings().withCharRange('j', 'l').ofMinLength(8).ofMaxLength(20);
    }

    @Provide
    Arbitrary<int[]> intArrayC() {
        Arbitrary<Integer> num = Arbitraries.integers().between(1,39);
        return num.array(int[].class).ofSize(7);
    }

    @Property boolean testA(@ForAll("intArrayA") int[] arr){
        return t.onKiva(arr);
    }

    @Property boolean testB(@ForAll("stringB") String s){
        return t.sisaltaakoMerkin(s);
    }

    @Property boolean testC(@ForAll("intArrayC") int[] arr){
        return t.lottorivinMinimialkiollaDublikaatteja(arr);
    }
}


