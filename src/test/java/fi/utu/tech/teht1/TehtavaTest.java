package fi.utu.tech.teht1;

import net.jqwik.api.*;


public class TehtavaTest {


    @Property
    boolean kokonaislukutaulukkoTest(@ForAll int[] arr) {
        return java.util.stream.IntStream.
                range(0, arr.length).allMatch(
                i -> arr[i] > 0);
    }
}

