import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetBasics {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(3);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set2.containsAll(set1));

        Set<Integer> st = new LinkedHashSet<>();
        st.add(30);
        st.add(30);
        st.add(40);
        st.add(30);
        st.add(30);
        st.add(30);
        st.add(60);

        System.out.println(st);

        Set<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(30);
        set.add(40);
        set.add(30);
        set.add(30);
        set.add(30);
        set.add(60);

        System.out.println(set);
    }
}