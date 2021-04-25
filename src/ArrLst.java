import java.util.Iterator;

public class ArrLst {
    public static void main(String[] args) {
        java.util.ArrayList<Integer>arrayList=new java.util.ArrayList<Integer>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(100);
        arrayList.add(3,8888);
        Iterator itr=arrayList .iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Object o: arrayList) {
            System.out.println(arrayList);
        }
        arrayList.forEach(Integer-> System.out.println(Integer));
    }

}
