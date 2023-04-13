package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer>list= List.of(1,89);
        Integer var=list.stream().hashCode();
        System.out.println(var);
    }
}