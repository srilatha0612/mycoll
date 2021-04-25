import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(null);
        list.add(null);
        list.add(200);
        list.add(1, 50);
        for (int i = 0; i < 5; i++) {
            System.out.println(list);
                 for (Object o : list) {

                System.out.println(list);
            }


            Iterator itr = list.iterator();
            while (itr.hasNext()) {

                System.out.println(itr.next());
            }
        }
        list.forEach(Integer -> System.out.println(Integer));
    }
}




