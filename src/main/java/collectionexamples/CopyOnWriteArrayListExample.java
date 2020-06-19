package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String args[]) {

        ArrayList<Integer> myOriginalList = new ArrayList<>();
        myOriginalList.add(1);
        myOriginalList.add(2);
        myOriginalList.add(3);

        Iterator<Integer> myIterator = myOriginalList.iterator();
        while (myIterator.hasNext()) {
            Integer temp = myIterator.next();
           // myOriginalList.add(4);//Throws ConcurrentModificationException
           // myIterator.remove();
        }

        System.out.println("------------------------");
        CopyOnWriteArrayList<Integer> myCopiedList = new CopyOnWriteArrayList<>(myOriginalList);
        Iterator<Integer> myCopyIterator = myCopiedList.iterator();
        int var = 4;
        while(myCopyIterator.hasNext()){
            Integer temp = myCopyIterator.next();//No ConcurrentModificationException
            System.out.println(temp);//Output is still 1 2 3. 4 is not included in output
            myCopiedList.add(var++);
        }

        System.out.println("------------------------");
        //Restart the iterator
        myCopyIterator = myCopiedList.iterator();
        while(myCopyIterator.hasNext()){
            Integer temp = myCopyIterator.next();//No ConcurrentModificationException
            System.out.println(temp);//Output is 1 2 3 4 5 6
        }

    }
}
