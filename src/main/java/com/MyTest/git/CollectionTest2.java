package com.MyTest.git;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 21);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("zhangsan",23);

        System.out.println(coll.contains(s4));
    }
}
