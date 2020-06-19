package hashcodeequalsexamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Tes {

    public static void main(String args[]){

        ValueObject v1 = new ValueObject("One",1);
        ValueObject v2 = new ValueObject("One",2);
        ValueObject v3 = new ValueObject("Three",3);

        Set<ValueObject> myset = new HashSet<>();
        myset.add(v1);
        myset.add(v2);
        myset.add(v3);

        System.out.println(myset.contains(v2));
        System.out.println(myset);

        HashMap<ValueObject,ValueObject> myMap = new HashMap<>();
        myMap.put(v1,v1);
        myMap.put(v2,v2);
        myMap.put(v3,v3);

        System.out.println(myMap);
        System.out.println(myMap.get(v1));


    }
}
