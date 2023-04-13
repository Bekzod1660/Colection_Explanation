package org.example;

public class Main {
    public static void main(String[] args) {

       MyQueue queue=new MyQueue(2);
       queue.offer(4);
   //    queue.offer(2);
        System.out.println(queue.offer(5));
        System.out.println(queue.peek());
        queue.print();
        System.out.println();
        System.out.println(queue.poll());
        queue.print();

    }
}