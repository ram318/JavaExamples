package j8streamexamples;

import java.util.ArrayList;
import java.util.HashMap;

public class ListToMap {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("One");
        namesList.add("Two");
        namesList.add("Three");
        namesList.add("One");
        namesList.add("Two");

        HashMap<String,Integer> namesCount = new HashMap<>();
        namesList.stream().forEach(name-> namesCount.compute(name,(namekey,value)-> {return value==null?1:++value;}));
        System.out.println(namesCount);
    }
}
