import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        java.util.Set<Integer> s=new java.util.HashSet<>();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(null);
        Iterator itr=s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Object o : s) {
            System.out.println(s);
        }
        s.forEach(String-> System.out.println(String));
    }
}
