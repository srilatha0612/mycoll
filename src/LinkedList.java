import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> ll=new java.util.LinkedList<Integer>();
        ll.add(300);
        ll.add(400);
        ll.add(500);
        ll.add(600);
        ll.add(800);
        ll.add(500);
        ll.add(null);
        ll.add(null);
        ll.add(3,999);
        ll.forEach(Integer-> System.out.println(Integer));
    }
}
