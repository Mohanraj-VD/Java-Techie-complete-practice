package com.practice.java.Exceptions;

public class MyException extends sum{

    public static void main(String[] args) throws CustomException {
        System.out.println(sum(5,10));
        System.out.println(sub(5,10));
        try{
            System.out.println(div(10,2));
        }

        catch (Exception e){
            throw new CustomException("Uncaught error");
        }
        try{
            System.out.println(div(10,0));
        }catch(Exception e){
            throw new CustomException("ArithmeticException da dei");
        }
        System.out.println(mul(5,10));

    }
}


class CustomException extends Exception {
    private String myError;
    CustomException(String input) {
        super(String.valueOf(input));
        this.myError=input;
//        this.printStackTrace();
    }
}

class sum{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
}