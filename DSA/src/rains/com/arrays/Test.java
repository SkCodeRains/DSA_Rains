package rains.com.arrays;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        List<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        System.out.println(qu);
        qu.remove(Integer.valueOf(1));
        System.out.println(qu);

        Iterator<Integer> it = qu.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
