import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Iterator;
import java.util.SortedSet;

public class Sorted2 {
    public static void main(String[] args) {
       java.util.SortedSet<Integer> set=new java.util.TreeSet<>();
       set.add(100);
       set.add(200);
       set.add(300);
       set.add(400);
       set.add(600);

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(600));
        System.out.println(set.tailSet(300));
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Object o: set) {
            System.out.println(set);
        }
        set.forEach(Integer-> System.out.println(Integer));
    }

}
