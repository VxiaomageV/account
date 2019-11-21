package com.example.account;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @author: mal
 * @date: 2019/11/21
 */
public class Lambda {

    public static void main(String[] arg) {

        String strs[] = {"Go", "Python", "PHP", "Java"};
        ArrayList<String> list = new ArrayList(Arrays.asList(strs));
        System.out.println("普通遍历方式：");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("Lambda遍历方式：");
        list.forEach((s) -> System.out.print(s + "\t"));
        System.out.println("\n双冒号操作符：");
        list.forEach(System.out::println);

    }

}
