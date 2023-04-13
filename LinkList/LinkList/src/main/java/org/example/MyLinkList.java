package org.example;

public class  MyLinkList {
    private class Node{
        private int val;
        private Node nexs;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node first;
    private Node last;
    private  int size;

    public void addFirst(int val){
        Node node=new Node(val);
        if (first==null){
            first=node;
            last=node;
            size++;
            return;
        }
        node.nexs=first;
        first=node;
        size++;
    }
    public void deleteFirst(){
        if (first==null){
            throw new IllegalArgumentException();
        }
        Node tim=first.nexs;
        first.nexs=null;
        first=tim;
        size--;

    }

    public void addLast(int val){
        Node node=new Node(val);
        if (first==null){
            first=node;
            last=node;
            size++;
            return;
        }
        last.nexs=node;
        size++;
    }

    public void deleteLast(){
        if (first==null){
            throw new IllegalArgumentException();
        }
        
    }
    public void addIndex(int index,int val){
        if (index>size||index<0){
            throw new ArithmeticException();
        }
        Node node=new Node(val);
        Node tim=first;
        if(index == 0){
            node.nexs=first;
            first = node;
            size++;
            return;
        }
        int x=0;
        while (index-1!=x){
            x++;
            tim=tim.nexs;
        }
        node.nexs=tim.nexs;
        tim.nexs=node;
        size++;
    }
    public int deleteIndex(int index){
        if (index>size||index<0){
            throw new ArithmeticException();
        }
        Node node=first;
       int c=0;
        int x=0;
        while (index-1!=x){
            x++;
            node=node.nexs;
        }
        c=node.nexs.val;
        first.nexs=node.nexs.nexs;
        size--;
       return c;
    }

    public int get(int index){
        if (index>=size||index<0){
            throw new ArithmeticException();
        }
        if (index==0){
            return first.val;
        }
        Node node=first;
        int x=0;
        while (index-1!=x){
            x++;
            node=node.nexs;
        }
        return node.nexs.val;
    }
    public int size(){
        return size;
    }
    public void print(){
        Node node=first;
        int x=0;
        System.out.print("[");
        while (node!=null){
            x++;
            System.out.print(node.val);
            node=node.nexs;
            if (!(size==x)) {
                System.out.print(", ");

            }
        }
        System.out.print("]");
    }
}
