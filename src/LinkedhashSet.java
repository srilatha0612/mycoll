import java.util.LinkedHashSet;

public class LinkedhashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<Integer> lh=  new java.util.LinkedHashSet<Integer>();
        lh.add(20);
        lh.add(30);
        lh.add(90);
        lh.add(50);
        lh.add(null);
        lh.add(null);
        lh.add(50);
        System.out.println(lh);
    }
}
