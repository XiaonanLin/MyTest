package com.MyTest.git;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //coll.clear();
        //System.out.println(coll);

        coll.remove("aaa");
        System.out.println(coll);

        boolean result = coll.contains("bbb");
        System.out.println(result);

        boolean result2 =  coll.isEmpty();
        System.out.println(result2);

        int result3 = coll.size();
        System.out.println(result3);
    }
}
