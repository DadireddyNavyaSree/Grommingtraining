package com.navya.singleton;

public class Test {
    public static void main(String[] args) {

        // compilation errro bcoz its private constructor , its not visible

//        DateUtil dateUtil = new DateUtil();

        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        System.out.println(dateUtil1 == dateUtil2);

    }
}
