package com.hongyb.pattern.factory.method;

import java.util.ArrayList;

/**
 * 作者:hongyanbo
 * 时间:2018/3/2
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("111");
        ArrayList<String> s2 = new ArrayList<>();
        s2.add(new String("111"));
        System.out.println(s1.containsAll(s2));
    }
}
