package com.reflection.demo.service;

import java.lang.reflect.Method;

/**
 *
 *
 *@description:
 *@author: klw
 *@time: 2020-10-21 11:26
 *
 */
public class ReflectionMethod {

     public  Object invokeMethod(String className, String methodName, Object[] args) throws Exception {
             Class ownerClass =  Class.forName(className);
             Object owner = ownerClass.newInstance();
             Class[] argsClass = new Class[args.length];
             for (int i = 0, j = args.length; i < j; i++) {
                     argsClass[i] = args[i].getClass();
                 }
             Method method = ownerClass.getMethod(methodName, argsClass);
             return method.invoke(owner, args);
         }
}
