package com.vue;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行出现OOM异常
 */
public class OomTest {
    public static void main(String[] args) {
        List<Byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new Byte[1024]);
            System.out.println("hello");
        }
    }
}
