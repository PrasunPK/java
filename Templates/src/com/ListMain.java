package com;

import java.util.HashSet;

/**
 * Created by prasunkp on 25/02/16.
 */
public class ListMain {
    public static void main(String[] args) {

        HashSet<Character> list = new HashSet<Character>();
        for (int i = 65; i < 91; i++){
            list.add((char)i);
        }

        for (Object element: list) {
            System.out.println(" "+ element.hashCode() +" -- "+ element);
        }

    }
}
