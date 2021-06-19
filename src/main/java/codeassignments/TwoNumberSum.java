package codeassignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoNumberSum {

    public static void main(String[] args) {
        int[] array  = {3,5,-4,8,11,1,-1,6};
        int targetSum =10;
        int result[] = twoNumberSum(array,targetSum);
        for(int i =0;i<result.length;i++){
            System.out.println(result[i]);;
        }
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {

        Set<Integer> mySet = new HashSet<>();
        for(int num: array){
            if(mySet.contains(targetSum - num)){
                return new int[]{num,targetSum-num};
            }else{
                mySet.add(num);
            }
        }

        return new int[0];
    }
}
