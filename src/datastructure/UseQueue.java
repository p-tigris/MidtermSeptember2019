package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue);

        int removed = queue.remove();
        System.out.println(removed);

        int first = queue.peek();
        System.out.println(first);

        int polled = queue.poll();
        System.out.println(polled);

        for (Integer index : queue) {
            System.out.print(index+" ");
        }
        System.out.println();
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

    }

}
