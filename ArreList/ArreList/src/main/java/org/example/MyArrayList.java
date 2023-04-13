package org.example;

import java.util.ArrayList;

public class MyArrayList {
    private  int arr[];
    private int size;

    public MyArrayList() {
        arr=new int[10];
    }

    public MyArrayList(int[] arr) {
        this.arr = arr;

    }
    public boolean add(int val){
        if ( size==arr.length){
            int tem[]=new  int[size*2];
            for (int i=0;i<size;i++){
                tem[i]=arr[i];
            }
            arr=tem;
        }
        arr[size++]=val;
        return  true;
    }
    public void print(){
        if (arr.length==0)return;
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i==size-1)break;
            System.out.print(", ");
        }
        System.out.println("]");
    }
    public boolean addIndex(int index,int val){
        if (index>size||index<0){
            throw new ArithmeticException();
        }
        if (size==arr.length){
            int tim[]=new int[size*2];
            for (int i=0;i<arr.length;i++){
                tim[i]=arr[i];
            }
            arr=tim;
        }
        for (int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        size++;
        arr[index]=val;
        return true;
    }
    public int size(){
        return size;
    }
    public int remuv(int index){
        if (index>size||index<0){
            throw new ArithmeticException();
        }
        int x=arr[index];
        for (int i=index;i<arr.length-1;i++){
           arr[i]=arr[i+1];
        }
        size--;
        return x;
    }
}
