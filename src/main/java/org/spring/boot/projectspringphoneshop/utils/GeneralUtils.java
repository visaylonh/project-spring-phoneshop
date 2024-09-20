package org.spring.boot.projectspringphoneshop.utils;

import java.util.List;

public class GeneralUtils {

    // convert list of string to list of Integer
    public static List<Integer> toIntegerList(List<String> list){
        return list.stream()
                .map(s -> s.length())
                .toList();
    }
}
