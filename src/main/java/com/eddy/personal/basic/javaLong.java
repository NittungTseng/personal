package com.eddy.personal.basic;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class javaLong {

    /**
     * Long中有一个静态的内部类LongCache，专门用于缓存-128至127之间的值，一共256个元素；
     *
     * @param args
     */
    public static void main(String[] args) {
        Long l1 = -129L;
        Long l2 = -129L;
        Long l3 = 127L;
        Long l4 = 127L;

        log.info("l1 == l2:{}", l1 == l2);  //*
        log.info("l3 == l4:{}", l3 == l4);

        log.info("l1.equals(l2):{}", l1.equals(l2));
        log.info("l3.equals(l4):{}", l3.equals(l4));

        Map<String, String> map = new HashMap<String, String>();

    }
}
