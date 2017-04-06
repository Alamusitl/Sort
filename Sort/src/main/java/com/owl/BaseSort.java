package com.owl;

/**
 * Created by Alamusi on 2017/4/6.
 */

class BaseSort {

    static void print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : Constant.sArray) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        System.out.println("-------------------------");
        System.out.println(stringBuilder.toString().trim());
        System.out.println("-------------------------");
    }
}
