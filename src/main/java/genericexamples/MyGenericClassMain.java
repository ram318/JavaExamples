package genericexamples;

public class MyGenericClassMain {
    public static void main(String args[]){
        MyGenericClass<Integer> myGen = new MyGenericClass<>();
        myGen.add(3);
        System.out.println(myGen.get());

        MyGenericClass<String> myGen1 = new MyGenericClass<>();
        myGen1.add("Hello World");
        System.out.println(myGen1.get());




    }
}
