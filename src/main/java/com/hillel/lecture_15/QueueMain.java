package com.hillel.lecture_15;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Bob");
        queue.add("Mark");
        queue.add("Alen");

        System.out.println("Queue syze :" + queue.size());

        String name = queue.peek();
        System.out.println("Queue peek " + name);
        System.out.println("Queue syze :" + queue.size());

        String name1 = queue.poll();
        System.out.println("Queue peek " + name1);
        System.out.println("Queue syze :" + queue.size());

       Iterator<String> iterator = queue.iterator();

       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }

    }

}
