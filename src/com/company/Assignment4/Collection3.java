package com.company.Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection3<Static> {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(" ABC");
        list.add(" Ram");
        list.add("Vinod");
        list.add("Roy");
        printAll(list);
    }

    public static void printAll(List<String> list) {
        Iterator<String> it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}




