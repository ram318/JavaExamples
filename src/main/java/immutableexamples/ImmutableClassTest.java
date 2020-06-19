package immutableexamples;

public class ImmutableClassTest {

    public static void main(String args[]){
        Student studentOne = new Student();
        String name = "name";
        studentOne.setName("Ram");
        MyImmutableClass myImmutableClass = new MyImmutableClass(1,name,studentOne);
        System.out.println(myImmutableClass.getStudent().getName());
        System.out.println(myImmutableClass.getName());

        //Changing the Student object
        name = "newname";
        studentOne.setName("Ravan");
        System.out.println(myImmutableClass.getStudent().getName());
        System.out.println(myImmutableClass.getName());

        //The object 'myImmutableClass' is changed because Student object is modified
        //To overcome this, deep copy of object should be performed
    }
}
