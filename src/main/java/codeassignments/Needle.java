package codeassignments;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
       String myStr = new BufferedReader(new InputStreamReader(haystack)).lines().collect(Collectors.joining(" "));
       myStr=myStr.replaceAll(",","").replaceAll("\\!","").replaceAll("\\.","").replaceAll("\\?","");

        String[] words = myStr.split(" ");
        HashMap<String,Integer> myMap = new HashMap<>();
        for(int i =0; i< words.length ; i++){
            int num = myMap.get(words[i])==null?0:myMap.get(words[i]);
            myMap.put(words[i],num+1);
        }

        return myMap.get(needle)!=null?myMap.get(needle):0;
    }

    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";
        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}