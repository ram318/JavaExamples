package immutableexamples;

public final class MyImmutableClass {

    private final int num;
    private final String name;
    private final Student stu;

    public MyImmutableClass(int num, String name, Student stu) {

        this.num = num;
        this.name = name;
        Student stunew = new Student();
        stunew.setName(stu.getName());
        this.stu = stunew;
    }
    //No Setters
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public Student getStudent(){
        return stu;
    }
}
