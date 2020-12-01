package com.company;

public class SortByLength {
    public static int sortByStringLength(String str1, String str2) {
        Integer str1Length = str1.length(), str2Length = str2.length();
        return str1Length.compareTo(str2Length);
    }
}
