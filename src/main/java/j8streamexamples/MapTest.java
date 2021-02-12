package j8streamexamples;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String args[]){

        //Create a Stream of Integers
        Stream<Integer> intList = Stream.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = intList.map(i->i*i).collect(Collectors.toList());
        System.out.println(result);

        List<Integer> evenNumbers = Arrays.asList(2,4,6,8,10);
        List<Integer> oddNumbers = Arrays.asList(1,3,5,7,9);
        List<List<Integer>> allNumsLists = Arrays.asList(oddNumbers,evenNumbers);

        List<Integer> allNumbers = allNumsLists.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(allNumbers);

        //Create Student objects
        Student stuone = new Student("Ram","3",1,45);
        Student stuTwo = new Student("Ravan","3",2,75);
        Student stuThree = new Student("Laxman","3",3,34);
        List<Student> stuList = Arrays.asList(stuone,stuThree,stuTwo);

        List<String> nameList = stuList.stream().map(s->s.getName()).collect(Collectors.toList());
        System.out.println(nameList);


        stuList.stream().map(s->s.getName()).forEachOrdered(System.out::println);
        stuList.stream().map(s->s.getPercentage()).forEach(stuone::getDivision);//forEach takes Consumer



    }
}
