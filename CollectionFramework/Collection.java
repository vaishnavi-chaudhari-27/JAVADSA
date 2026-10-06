import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        // List orr Collection -> interface

        // ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(40);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        // addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(105);
        list2.add(60);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("Printing list2: " + list2);
        list2.clear();
        System.out.println(list2.size());

        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(15);
        list3.add(17);
        list3.add(19);
        System.out.println(list3.get(2));
        System.out.println("Before set: " + list3);
        list3.set(0, 56);
        System.out.println("After set: " + list3);

        // toArray//
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // contains//
        System.out.println(list3.contains(45));
        list.add(60);
        System.out.println("Printing Entire List: " + list);

        Collections.sort(list);
        System.out.println("Printing Entire List: " + list);

        ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
        System.out.println("Printing Entire newList: " + list);
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        System.out.println(list.indexOf(40));
        // System.out.println("Before set: " + list3);
        // list3.set(0, 56);
        // System.out.println("After set: " + list3);
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();
    }
}