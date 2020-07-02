package com.vue;

import java.util.HashMap;
import java.util.Map;

public class MainTest {
    /**
     * Map的put方法在第一次put操作时返回null，再次put相同key的时候会返回映射value;
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        String put = map.put("ljf", "lijianfeng");

        System.out.println(put);

        String put2 = map.put("ljf", "lijianfeng");

        System.out.println(put2);
    }
}
