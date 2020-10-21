package com.reflection.demo.service;

import org.junit.Test;

import java.util.List;

/**
 *
 *
 *@description:
 *@author: klw
 *@time: 2020-10-21 11:37
 *
 */
public class ReflectionTest {

    @Test
    public void test1() throws Exception {

        List<Params> paramsList = Params.getParamsList();
        ReflectionMethod rf = new ReflectionMethod();
        for (Params params : paramsList) {
            rf.invokeMethod(params.getClassName(),params.getMethodName(),params.getArgs());
        }
    }
}
