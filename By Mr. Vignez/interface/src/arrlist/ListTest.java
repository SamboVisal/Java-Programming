package arrlist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sambo visal on 21/10/2017.
 */
public class ListTest {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList);
        for(Object n : arrayList){
            System.out.println(n);
        }
        System.out.println("Using iterator");
        Iterator i = arrayList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}
