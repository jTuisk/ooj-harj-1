package fi.utu.tech.teht1;

public class Tehtava {

    /**
     * Palauttaa arvon tosi, jos taulukossa 'kiva' kaikki arvot ovat positiiviset.
     * @.pre    kiva != null
     * @.post   FORALL(num: kiva; num > 0)
     */
    boolean onKiva(int[] kiva){
        if(kiva == null)
            return false;

        for(int num : kiva){
            if(num < 1)
                return false;
        }
        return true;
    }

    /**
     * Palauttaa arvon tosi, jos merkkijonossa str -> 'syöte' on merkki c -> 'k'
     * @.pre    str != null &&
     *          str.length > 0 &&
     *          c != '\u0000'
     * @.post    FORALL(i: 0 <= i < str.length; str[i] == c)
     */
    boolean sisaltaakoMerkkiMerkkijonossa(String str, char c){
        if(str == null || str.length() < 1 || c == '\u0000')
            return false;

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
     * @.post   EXIST(i: 0 <= i < lottorivi.lengh;
     *              FORALL(j: 0 <= j < lottorivi.length;
     *              lottorivi[i] == lottorivi[j])
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
