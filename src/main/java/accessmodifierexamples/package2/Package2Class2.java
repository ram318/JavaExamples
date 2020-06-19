package accessmodifierexamples.package2;

public class Package2Class2 {
    public static void main(String args[]){
        Package2Class p2 = new Package2Class();
        p2.publicStr = "";//Public fields are accessible
        p2.defaultStr = "";//default fields are accessible
        p2.protectedStr="";//Protected fields are accessible
    }
}
