package fi.utu.tech.teht1;

public class Tehtava {

    /**
     * Palauttaa arvon tosi, jos taulukossa 'kiva' kaikki arvot ovat positiiviset.
     * @.pre    kiva != null &&
     *          FORALL(num: kiva; num > 0)
     * @.post   true
     */
    boolean onKiva(int[] kiva){
        for(int num : kiva){
            if(num < 1)
                return false;
        }
        return true;
    }

    /**
     * Palauttaa arvon tosi, jos merkkijonossa str -> 'syöte' on merkki c -> 'k'.
     * @.pre    str != null &&
     *          str.length > 0 &&
     *          c != null &&
     *          FORALL(i: 0 <= i < str.length; str[i] == c)
     * @.post   true
     */
    boolean sisaltaakoMerkkiMerkkijonossa(String str, char c){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c)
                return true;
        }
        return false;
    }

    /**
     * @.pre    lottorivi != null &&
     *          lottorivi.length == 7 &&
     *          FORALL(num: lottorivi; num > 0 && num < 41)
     * @.post   EXISTS(k:
     *              FORALL(i: 0 <= i < lottorivi.length; Math.min(lottorivi[mín_num_index], lottorivi[i]);
     *              EXISTS(j: 0 <= j < lottorivi.length;
     *              i != j && RESULT[i] == RESULT[j]))
     */
    boolean lottorivinMinimialkiollaDublikaatteja(int[] lottorivi){
        int min_num_index = 0;
        for(int i = 1; i < lottorivi.length; i++){
            if(lottorivi[min_num_index] > lottorivi[i]){
                lottorivi[min_num_index] = lottorivi[i];
                min_num_index = i;
            }
        }
        for(int i = 0; i  < lottorivi.length; i++){
            if(min_num_index == i)
                continue;

            if(lottorivi[min_num_index] == lottorivi[i])
                return true;
        }
        return false;
    }


}
