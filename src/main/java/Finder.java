/**
 * Author: Avery Hyman (amh0120)
 * Course: COMP 3700
 * Professor: Dr. Tung Nguyen
 */

//Java class the is able to search for the Maximum and Minimum values of an Array
public class Finder {

    //Java Function that finds the max value found in the array intArray
    public Integer findMax(int[] intArray){
        Integer max;
        int answer = Integer.MIN_VALUE;
        if (intArray == null || intArray.length < 1){
            return null;
        }

        else {
            for(int i = 0; i < intArray.length; i++){
                if (answer < intArray[i]){
                    answer = intArray[i];
                }
            }

        }
        max = answer;
        return max;
    }

    //Java Function that finds the minimum value found in the array intArray
    public Integer findMin( int[] intArray){
        Integer min;
        int answer = Integer.MAX_VALUE;
        if (intArray == null || intArray.length < 1){
            return null;
        }
        else {
            for(int i = 0; i < intArray.length; i++){
                if (answer > intArray[i]){
                    answer = intArray[i];
                }
            }
        }
        min = answer;
        return min;
    }
}
