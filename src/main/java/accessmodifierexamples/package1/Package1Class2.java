package accessmodifierexamples.package1;

import accessmodifierexamples.package2.Package2Class;

public class Package1Class2 extends Package2Class {

    public static void main(String args[]){
        Package1Class2 p1 = new Package1Class2();
        p1.publicStr="";//Public fields are accessible
        p1.protectedStr="";//protected fields are accessible
    }
}
