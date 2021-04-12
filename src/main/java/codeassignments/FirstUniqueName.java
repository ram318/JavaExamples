package codeassignments;

import java.util.*;

public class FirstUniqueName {
    public static String firstUniqueName(String[] names) {

        LinkedHashMap<String,Integer> myMap = new LinkedHashMap<>();
        for(int i =0; i< names.length ; i++){
           int num = myMap.get(names[i])==null?0:myMap.get(names[i]);
            myMap.put(names[i],num+1);
        }

        Iterator<Map.Entry<String,Integer>> i = myMap.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry<String,Integer> entry = i.next();
            if(entry.getValue() ==1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "India", "Pakistan","Pakistan","Pakistan", "Bangladesh", "India","Srilanka" }));
        String sample = "Hello";
        StringBuffer sampleBuf = new StringBuffer(sample);
    }
}