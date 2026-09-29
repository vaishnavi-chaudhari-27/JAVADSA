/* List + ArrayLis*/

// import java.util.ArrayList;
// import java.util.List;

// public class CollectionDemo {
//     public static void main(String[] args) {
//         List<String> names = new ArrayList<>();

//         names.add("Raj");
//         names.add("Vaishu");
//         names.add("Vaishu");

//         System.out.println(names);
//     }
// }

/* Set */
// import java.util.HashSet;
// import java.util.Set;

// public class CollectionDemo {
//     public static void main(String[] args) {
//         Set<String> names = new HashSet<>();

//         names.add("Raj");
//         names.add("Vaishu");
//         names.add("Vaishu");

//         System.out.println(names);

//     }
// }

/* Queue */

import java.util.LinkedList;
import java.util.Queue;

public class CollectionDemo {
    public static void main(String[] args) {
        Queue<String> Queue = new LinkedList<>();

        Queue.add("Raj");
        Queue.add("Vaishu");
        Queue.add("Rina");

        System.out.println(Queue);

        System.out.println(Queue.poll());

        System.out.println(Queue);
    }
}