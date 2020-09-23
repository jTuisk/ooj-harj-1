package fi.utu.tech.teht4;

import fi.utu.tech.teht1.Tehtava;
import net.jqwik.api.*;

public class Tehtava1Test {

    Tehtava t = new Tehtava();

    @Property void testA(@ForAll int[] arr){
        t.onKiva(arr);
    }

    @Property void testB(@ForAll String s){
        t.sisaltaakoMerikin(s);
    }

    @Property void testC(@ForAll int[] arr){
        t.lottorivinMinimialkiollaDublikaatteja(arr);
    }

}


