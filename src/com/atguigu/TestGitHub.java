package com.atguigu;

import java.util.ArrayList;

/**
 * @author bigsand
 * @create 2019-06-03 18:32
 */
public class TestGitHub {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        if (list != null) {
            for (Object o : list) {
                System.out.println(" " + o);
            }
        }
    }
}
