import java.util.Iterator;

public class LinkeList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> ll=new  java.util.LinkedList<Integer>();
        ll.add(2000);
        ll.add(4000);
        ll.add(4333);
        ll.add(9999);
        ll.add(null);
        ll.add(null);
        ll.add(2000);
        ll.add(3,0000);
        Iterator itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Object o: ll) {
            System.out.println(ll);
        }
        ll.forEach(Integer-> System.out.println(Integer));
    }
}
