package codeassignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

        public static char firstNonRepeatingCharacter(String string) {
            char[] charArray = string.toCharArray();
            Map<Character,Integer> myMap = new LinkedHashMap<>();
            for(int i =0; i< charArray.length;i++){
                if(myMap.computeIfPresent(charArray[i],(k,v)->v+1)==null){
                    myMap.put(charArray[i],1);
                }
            }
            return myMap.entrySet().stream().filter(e-> e.getValue() == 1).findFirst().get().getKey();
        }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("hijhijklmnfgmn"));
    }

}
