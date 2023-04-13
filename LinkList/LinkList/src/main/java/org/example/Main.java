package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer>list=new LinkedList<>();
//        list.addFirst(2);
//        list.addFirst(3);
//        list.addFirst(1);
//        System.out.println(list.get(1));
//
//        System.out.println(list);


       MyLinkList myLinkList=new MyLinkList();

        myLinkList.addFirst(1);
       myLinkList.addFirst(2);
       myLinkList.addFirst(3);
        myLinkList.addLast(99);
        myLinkList.addIndex(0,100);
      //  System.out.println(myLinkList.deleteIndex(1));
        System.out.println(myLinkList.get(0));
        myLinkList.print();
        System.out.println("");
        System.out.println(myLinkList.size());
    }
}