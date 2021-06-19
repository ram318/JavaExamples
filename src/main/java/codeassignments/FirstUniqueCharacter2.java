package codeassignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter2 {

        public static int firstNonRepeatingCharacter(String string) {
            char[] charArray = string.toCharArray();
            Map<Character,Integer> myMap = new LinkedHashMap<>();
            for(int i =0; i< charArray.length;i++){
                if(myMap.computeIfPresent(charArray[i],(k,v)->v+1)==null){
                    myMap.put(charArray[i],1);
                }
            }
            for(int i =0; i< charArray.length;i++){
                if(myMap.get(charArray[i])==1){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
            String input ="hijhijklmnfgmn";
      int index = firstNonRepeatingCharacter(input);
        System.out.println("Found " +input.charAt(index) +" at "+index);
    }

}
