package org.example;

import java.util.NoSuchElementException;

public class MyQueue {

    private int arr[];
    private int size;
    public MyQueue(int n){
        arr=new int[n];

    }
    public boolean offer( int endex){
        if (size==arr.length){
            return false;
        }
        arr[size++]=endex;
        return true;
    }
    public int poll(){
        if (size==0){
            throw new NoSuchElementException();
        }
        int x=arr[0];
        arr[0]=0;

        return x;
    }
    public String peek(){
        if (size==0){
            return null;
        }
        String x= String.valueOf(arr[0]);
        return x;
    }
    public void print(){
        if (size==0){
            throw new NoSuchElementException();
        }
        System.out.print("[");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]);
            if (size-1==i)break;
            System.out.print(",");
        }
        System.out.print("]");
    }
    public int size(){
        return size;
    }
}
