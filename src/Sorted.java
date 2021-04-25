import java.util.Iterator;
import java.util.SortedSet;

public class Sorted {
    public static void main(String[] args) {
        java.util.SortedSet<String> ss=new java.util.TreeSet<>();
        ss.add("aaa");
        ss.add("bbb");
        ss.add("ccc");
        ss.add("ddd");
        System.out.println("the elements of set are"+ ss.first());
        System.out.println("the last elements are"+ ss.last());
        System.out.println("the elements of headset are"+ ss.headSet("ccc"));
        System.out.println("the elements of tailset  are"+ ss.tailSet("bbb"));
    Iterator itr=ss.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }
        for (Object o: ss) {
            System.out.println(ss);
        }
        ss.forEach(String-> System.out.println(String));
    }
}
