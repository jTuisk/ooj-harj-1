package fi.utu.tech.teht1;

public class Tehtava {

    /**
     * Palauttaa arvon tosi, jos taulukossa 'kiva' kaikki arvot ovat positiiviset.
     * @.pre    kiva != null
     * @.post   FORALL(num: kiva; kiva[num] > 0)
     */
    public boolean onKiva(int[] kiva){
        if(kiva == null)
            return false;

        for(int num : kiva){
            if(num < 1)
                return false;
        }
        return true;
    }

    /**
     * Palauttaa arvon tosi, jos merkkijonossa on merkki'k'
     * @.pre    str != null &&
     *          str.length >
     * @.post   EXIST(i: 0 <= i < str.length; str[i] == 'k')
     */
    public boolean sisaltaakoMerkin(String str){
        if(str == null || str.length() < 1)
            return false;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'k')
                return true;
        }
        return false;
    }

    /**
     * @.pre    lottorivi != null &&
     *          lottorivi.length == 7 &&
     *          FORALL(num: lottorivi; num > 0 && num < 40)
     * @.post   EXIST(i: 0 <= i < lottorivi.lengh;
     *              FORALL(j: 0 <= j < lottorivi.length;
     *                  i != j && lottorivi[i] == lottorivi[j])
     */
    public boolean lottorivinMinimialkiollaDublikaatteja(int[] lottorivi){
        if(lottorivi == null || lottorivi.length != 7)
            return false;

        for(int n : lottorivi){
            if(n < 1 || n > 39)
                return false;
        }

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
