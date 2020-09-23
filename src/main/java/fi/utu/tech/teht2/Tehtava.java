package fi.utu.tech.teht2;

public class Tehtava {

    float BMI_alipainon_raja = 18.5f;

    /**
     * Palauttaa BMI(Body mass index) arvon. Arvo tulee paino/pituus/pituus
     * @.pre    paino > 0 &&
     *          pituus > 0.0F
     * @.post  RESULT (paino/pituus/pituus)
     */
    public float getBMI(int paino, float pituus){
        return ((float)paino/pituus/pituus);
    }
    /**
     * Palauttaa true/false riippuen onko alipainoinen.
     * @.pre    paino > 0 &&
     *          pituus > 0.0F
     * @.post   RESULT (BMI_alipainon_raja >= getBMI(paino, pituus))
     */
    public boolean onkoAlipainoinen(int paino, float pituus){
        return getBMI(paino, pituus) < BMI_alipainon_raja;
    }
}