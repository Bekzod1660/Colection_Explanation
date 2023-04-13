package org.example;

public class MySteck {
   private int arr[];
   private int saze;

    public MySteck() {
        arr=new int[10];
    }
    public void push(int element){
        if (saze==arr.length){
            int []tim=new int[saze*2];
            for (int i=0;i<saze;i++){
                tim[i]=arr[i];
            }
            arr=tim;
        }
        arr[saze++]=element;
    }
    public void print(){
        System.out.print("[");
        for (int i=0;i<saze;i++){
            System.out.print(arr[i]+"");
            if (saze-1==i)break;
            System.out.print(", ");
        }
        System.out.print("] ");
    }
    public int peek(){
        if (saze==0){
            throw new ArithmeticException();
        }
        return arr[saze-1];
    }
    public int pop(){
        if (saze==0){
            throw new ArithmeticException();
        }
        System.out.println();
      return arr[--saze];
    }
    public int size(){
        return saze;
    }
}
