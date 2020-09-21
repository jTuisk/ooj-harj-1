package fi.utu.tech.teht2;

public class Tehtava {

    float BMI_alipainon_raja = 18.5f;

    /**
     * Palauttaa BMI(Bodymass index) arvon. Arvo tulee paino/pituus/pituus
     * @param paino kg
     * @param pituus metriä
     * @return  BMI joka tulee laskusta paino/pituus/pituus
     * @.pre    paino > 0 &&
     *          pituus > 0.0F
     * @.post   RESULT (paino/pituus/pituus)
     */
    public float getBMI(int paino, float pituus){
        return ((float)paino/pituus/pituus);
    }
    /**
     * Palauttaa true/false riippuen onko alipainoinen.
     * @param paino
     * @param pituus
     * @return true, jos paino index on pienempi kuin BMI_alipainon_raja, muuten false
     * @.pre    paino > 0 &&
     *          pituus > 0.0F
     * @.post   RESULT (BMI_alipainon_raja >= getBMI(paino, pituus))
     */
    public boolean onkoAlipainoinen(int paino, float pituus){
        return BMI_alipainon_raja >= getBMI(paino, pituus);
    }
}
