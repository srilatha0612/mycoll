import java.util.Iterator;

public class Set2 {
    public static void main(String[] args) {
        java.util.Set <Integer> ss=new java.util.HashSet<>();
        ss.add(800);
        ss.add(300);
        ss.add(600);
        ss.add(null);
        ss.add(null);
        ss.add(800);
        Iterator itr=ss.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Object o: ss) {
            System.out.println(ss);
        }
        ss.forEach(Integer-> System.out.println(Integer));
    }
}
