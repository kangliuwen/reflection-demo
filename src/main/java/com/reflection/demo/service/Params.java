package com.reflection.demo.service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *@description:
 *@author: klw
 *@time: 2020-10-21 11:38
 *
 */
public class Params {

    private String className;
    private String methodName;
    private Object[] args;

    public Params(String methodName, Object[] args) {
        this.methodName = methodName;
        this.args = args;
    }

    public Params() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public static List<Params> getParamsList(){
        ArrayList<Params> paramsList = new ArrayList<>();
        Params params1 = new Params();
        params1.setClassName("com.reflection.demo.service.StupidDog");
        params1.setMethodName("dogBark");
        Object[] par = {"馒头",6};
        params1.setArgs(par);

        Params params2 = new Params();
        params2.setClassName("com.reflection.demo.service.StupidMan");
        params2.setMethodName("manWorking");
        Object[] par2 = {"韩梅梅"};
        params2.setArgs(par2);

        paramsList.add(params1);
        paramsList.add(params2);
        return paramsList;
    }
}
