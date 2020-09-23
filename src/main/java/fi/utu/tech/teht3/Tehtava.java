package fi.utu.tech.teht3;

import java.util.Arrays;

public class Tehtava {

    /**
     * Check if given multidimension array position is valid to set new value.
     * @.pre    arr != null &&
     *          arr.length > 0 &&
     *          pos != null
     * @.post   (arr[pos.getX()][pos.getY()] == 0) Throw IndexOutOfBoundsException
     *
     * @.Throw  false???
     */
    boolean isValidPosition(int[][] arr, Position pos) {
        if(arr == null || pos == null)
            return false;

        try {
            if(arr[pos.getX()][pos.getY()] == 0)
                return true;

        }catch(IndexOutOfBoundsException err){
            //System.out.println(err.getMessage());
            return false;
        }
        return false;
    }

    /**
     * Add fromArr valid values to toArr using isValidPosition to check value is valid
     * @.pre    toArr != null &&
     *          fromArr != null &&
     *          pos != null
     * @.post   RESULT !isValidPosition(toArr, new Position(pos.getX()+x, pos.getY()+y))
     */
    public boolean updatedValidArea(int[][] toArr, int[][] fromArr, Position pos){
        int[][] temp = getCopyOfMultidimensionArray(toArr);

        for(int x = 0; x < fromArr.length; x++){
            for(int y = 0; y < fromArr[x].length; y++){
                if(fromArr[x][y] != 0){
                    if(toArr[pos.getX()+x][pos.getY()+y] != 0) //??
                        continue;

                    if(isValidPosition(toArr, new Position(pos.getX()+x, pos.getY()+y))){
                        temp[pos.getX()+x][pos.getY()+y] = fromArr[x][y];
                    }else{
                        return false;
                    }
                }
            }
        }
        toArr = temp;
        for(int i = 0; i < toArr.length; i++){
            System.out.println(Arrays.toString((toArr[i])));
        }
        return true;
    }

    /**
     * Return copy of given multidimension array.
     * @.pre    arr != null
     * @.post   arr?
     */
    int[][] getCopyOfMultidimensionArray(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                temp[i][j] = arr[i][j];
            }
        }
        return temp;
    }
}
