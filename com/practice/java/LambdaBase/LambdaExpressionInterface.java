package com.practice.java.LambdaBase;

@FunctionalInterface
public interface LambdaExpressionInterface {

    /*FunctionalInterface can have many static,default methods.
    * But Atleast one abstract method should be present*/
    void switchON();
//    default void m2(){
//        System.out.println("Default m2");
//    }
//    default void m3(){
//        System.out.println("Default m3");
//    }
//    static void m4(){
//        System.out.println("Default m4");
//    }
}
