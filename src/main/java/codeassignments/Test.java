package codeassignments;

import java.util.HashMap;

public class Test {
    public static void main(String args[]){
        int[] sumTriple = {-1,-2,3,-4,5,6};
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i =0;i<sumTriple.length;i++){
            myMap.put(sumTriple[i],1);
        }

        for(int i =0;i<sumTriple.length;i++){
            for(int  j =i+1;j<sumTriple.length;j++){
                int sum = sumTriple[i]+sumTriple[j];
                if(myMap.get(0-sum)!=null){
                    System.out.printf("(%d,%d,%d)",sumTriple[i],sumTriple[j],-sum);
                }
            }
        }
    }
}
