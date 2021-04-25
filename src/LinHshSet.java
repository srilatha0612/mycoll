import java.util.LinkedHashSet;

public class LinHshSet {
    public static void main(String[] args) {
        java.util.Set<Integer> lh=new LinkedHashSet<Integer>();
        lh.add(333);
        lh.add(222);
        lh.add(999);
        lh.add(999);
        lh.add(null);
        System.out.println(lh);
    }
}
