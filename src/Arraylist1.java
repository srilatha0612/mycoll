import java.util.Iterator;

public class Arraylist1 {
    public static void main(String[] args) {
        java.util.ArrayList <Integer> list= new java.util.ArrayList <Integer> ();
        list.add(1000);
        list.add(2000);
        list.add(3999);
        list.add(null);
        list.add(null);
        list.add(1000);
        list.add(3,777);
        list.forEach(Integer-> System.out.println(Integer));

    Iterator itr=list.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }
        for (Object o: list) {
            System.out.println(list);
        }
        for (int i=0;i<5;i++){
            System.out.println(list);
        }
    }

}
