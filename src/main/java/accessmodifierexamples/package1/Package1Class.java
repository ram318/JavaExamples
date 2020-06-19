package accessmodifierexamples.package1;

import accessmodifierexamples.package2.Package2Class;

public class Package1Class {

    public static void main(String args[]){
        Package2Class p2 = new Package2Class();
        p2.publicStr="";//Only Public fields from Package1Class of the package 'package1' is accessible
    }


}
