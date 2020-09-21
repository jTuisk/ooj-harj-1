package fi.utu.tech.teht3;

import java.util.Arrays;

public class Tehtava {

    /**
     * Check if given multidimension array position is valid to set new value.
     *
     * @param arr = Multidimension int array
     * @param pos = Class position that includes x and y coordinates ( new Position(x,y)
     * @return If position(x,y) value is 0 return true else false
     */
    boolean isValidPosition(int[][] arr, Position pos) {
        try {
            if(arr[pos.getX()][pos.getY()] == 0)
                return true;

        }catch(Exception err){
            //System.out.println(err.getMessage());
            return false;
        }
        return false;
    }

    public boolean updatedValidArea(int[][] toArr, int[][] fromArr, Position pos){
        int[][] temp = getCopyOfArray(toArr);

        for(int x = 0; x < fromArr.length; x++){
            for(int y = 0; y < fromArr[x].length; y++){
                if(fromArr[x][y] != 0){
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

    int[][] getCopyOfArray(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                temp[i][j] = arr[i][j];
            }
        }
        return temp;
    }
}
