package practic30;

import practic30.AbstractQueue;
import practic30.ArrayQueue;
import practic30.LinkQueue;

public class Main {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        AbstractQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.poll();
        }
        System.out.println(queue.isEmpty());
    }

    public static void test2() {
        AbstractQueue<Integer> queue = new LinkQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.poll();
        }
        System.out.println(queue.isEmpty());
    }
}
