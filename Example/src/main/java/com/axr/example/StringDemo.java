package com.axr.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xinrui.an
 * @date 2025/03/04
 */
public class StringDemo {
    public static void main(String[] args) {
        StringDemo demo = new StringDemo();
        demo.testSet();
    }

    private boolean testSet() {
        String s1 = "abc,aca,caa,aaa,bbb";
        String s2 = "aaa,bbb,ccc,ddd";
        Set<String> set = new HashSet<String>(Arrays.asList(s1.split(",")));
        String[] split = s2.split(",");
        for (String s : split) {
            if (set.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
