public class Sort {
    public static void main(String[] args) {
        java.util.SortedSet<Integer> sss=new java.util.TreeSet<Integer>();
        sss.add(20);
        sss.add(30);
        sss.add(90);
        sss.add(50);
        sss.add(null);
        System.out.println(sss.tailSet(30));
        System.out.println(sss.headSet(50));
        System.out.println(sss.last());
        System.out.println(sss.first());
    }
}
