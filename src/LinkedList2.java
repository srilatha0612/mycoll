import java.util.Iterator;

public class LinkedList2 {
    public static void main(String[] args) {
        java.util.LinkedList<String> llist=new java.util.LinkedList<String>();
        llist.add("aaa");
        llist.add("aas");
        llist.add("ddd");
        llist.add(null);
        llist.add(null);
        llist.add("aaa");
        llist.add(2,"kkk");
        Iterator itr=llist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Object o: llist) {
            System.out.println(llist);
        }
        llist.forEach(String-> System.out.println(String));
    }
}
