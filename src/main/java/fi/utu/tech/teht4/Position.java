package fi.utu.tech.teht4;

public class Position {
    int x;
    int y;


    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * palauttaa x arvon:
     * @.pre true
     * @.post x
     */
    public int getX() {
        return this.x;
    }

    /**
     * palauttaa y arvon
     * @.pre true
     * @.post y
     */
    public int getY() {
        return this.y;
    }
}
