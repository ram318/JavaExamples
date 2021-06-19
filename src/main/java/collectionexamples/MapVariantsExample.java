package collectionexamples;

import model.Address;
import model.Employee;
import model.Student;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapVariantsExample {
    public static void main(String[] args) {
        System.out.println("------ HashMap example ------");
        hashMapTest();
        System.out.println("------ WeakHashMap example ------");
        weakHashMapTest();
        System.out.println("------ ConcurrentHashMap example ------");
        concurrentHashMapTest();
        System.out.println("------ LinkedHashMap example ------");
        linkedHashMapTest();
        System.out.println("------ TreeMap example ------");
        treeMapTest();
        System.out.println("------ IdentityHashMap example ------");
        identityHashMapTest();
    }

    public static void hashMapTest() {
        Student studentOne = new Student("Ram","1A",25,70);
        Student studentTwo = new Student("Krishna","1A",26,71);
        Student studentThree = new Student("Ram","1A",25,70);

        Address studentOneAddress = new Address("1-100","S.Puram","Hyderabad","AP/TS","500060");
        Address studentTwoAddress = new Address("1-101","S.Puram","Hyderabad","AP/TS","500060");

        Map<Student,Address> myMap = new HashMap<>();
        myMap.put(studentOne,studentOneAddress);
        myMap.put(studentTwo,studentTwoAddress);
        myMap.put(studentThree,studentTwoAddress);//This one will override the first 'studentOne' key. Check the same in IdentityHashMap

        studentOne = null;
        studentTwoAddress=null;
        System.gc();
        myMap.entrySet().stream().forEach(e-> System.out.println(e.getKey().getName()+"\t"+e.getValue().toString()));

    }

    public static void weakHashMapTest() {
        Student studentOne = new Student("Ram","1A",25,70);
        Student studentTwo = new Student("Krishna","1A",26,71);

        Address studentOneAddress = new Address("1-100","S.Puram","Hyderabad","AP/TS","500060");
        Address studentTwoAddress = new Address("1-101","S.Puram","Hyderabad","AP/TS","500060");

        Map<Student,Address> studentMap = new WeakHashMap<>();
        Map<Student,Address> myMap = new HashMap<>();
        studentMap.put(studentOne,studentOneAddress);
        studentMap.put(studentTwo,studentTwoAddress);

        studentOne = null;
        studentTwoAddress=null;
        System.gc();
        studentMap.entrySet().stream().forEach(e-> System.out.println(e.getKey().getName()+"\t"+e.getValue().toString()));

    }

    public static void concurrentHashMapTest() {
        Student studentOne = new Student("Ram","1A",25,70);
        Student studentTwo = new Student("Krishna","1A",26,71);

        Address studentOneAddress = new Address("1-100","S.Puram","Hyderabad","AP/TS","500060");
        Address studentTwoAddress = new Address("1-101","S.Puram","Hyderabad","AP/TS","500060");

        Map<Student,Address> myMap = new ConcurrentHashMap<>();
        myMap.put(studentOne,studentOneAddress);
        myMap.put(studentTwo,studentTwoAddress);

        studentOne = null;
        studentTwoAddress=null;
        System.gc();
        myMap.entrySet().stream().forEach(e-> System.out.println(e.getKey().getName()+"\t"+e.getValue().toString()));

    }

    public static void linkedHashMapTest() {
        Student studentOne = new Student("Ram","1A",25,70);
        Student studentTwo = new Student("Krishna","1A",26,71);

        Address studentOneAddress = new Address("1-100","S.Puram","Hyderabad","AP/TS","500060");
        Address studentTwoAddress = new Address("1-101","S.Puram","Hyderabad","AP/TS","500060");

        Map<Student,Address> myMap = new LinkedHashMap<>();
        myMap.put(studentOne,studentOneAddress);
        myMap.put(studentTwo,studentTwoAddress);

        studentOne = null;
        studentTwoAddress=null;
        System.gc();
        myMap.entrySet().stream().forEach(e-> System.out.println(e.getKey().getName()+"\t"+e.getValue().toString()));

    }

    public static void treeMapTest() {
        Student studentOne = new Student("Ram","1A",25,70);
        Student studentTwo = new Student("Krishna","1A",26,71);

        Address studentOneAddress = new Address("1-100","S.Puram","Hyderabad","AP/TS","500060");
        Address studentTwoAddress = new Address("1-101","S.Puram","Hyderabad","AP/TS","500060");

        Map<Student,Address> myMap = new TreeMap<Student,Address>((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        myMap.put(studentOne,studentOneAddress);
        myMap.put(studentTwo,studentTwoAddress);

        studentOne = null;
        studentTwoAddress=null;
        System.gc();
        myMap.entrySet().stream().forEach(e-> System.out.println(e.getKey().getName()+"\t"+e.getValue().toString()));

    }


    public static void identityHashMapTest() {
        Student studentOne = new Student("Ram","1A",25,70);
        Student studentTwo = new Student("Krishna","1A",26,71);
        Student studentThree = new Student("Ram","1A",25,70);

        Address studentOneAddress = new Address("1-100","S.Puram","Hyderabad","AP/TS","500060");
        Address studentTwoAddress = new Address("1-101","S.Puram","Hyderabad","AP/TS","500060");

        Map<Student,Address> myMap = new IdentityHashMap<>();
        myMap.put(studentOne,studentOneAddress);
        myMap.put(studentTwo,studentTwoAddress);
        myMap.put(studentThree,studentTwoAddress);//This won't override studentOne, as IdentityHashMap compares the key using '==' instead of .equals

//        System.out.println(studentOne.equals(studentThree));
        studentOne = null;
        studentTwoAddress=null;
        System.gc();

        myMap.entrySet().stream().forEach(e-> System.out.println(e.getKey().getName()+"\t"+e.getValue().toString()));

    }

}
