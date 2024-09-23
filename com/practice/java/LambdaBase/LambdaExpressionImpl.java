package com.practice.java.LambdaBase;

//The expression through which we can repreent an Anonymous fucntion.
//Anonymous : Nameless / Unknown
// A method who don't have any name or modifier
public class LambdaExpressionImpl {

    //Traditional Approach
    public void switchON(){
        System.out.println("Normal method");
    }

    /*(){
        System.out.println("Anonymous");
    }*/

//lambda expression  ()   ->   {body};
    public static void main(String[] args) {
        new LambdaExpressionImpl().switchON();
        // Lambda Expression approach
        LambdaExpressionInterface lambdaExpressionInterface = () ->         //Use Parenthesis if multiple statements used
            System.out.println("Switch On");

        lambdaExpressionInterface.switchON();

        //Lambda expression with input
        LambdaExpInterface2 lambdaExpInterface2 = (i1,i2)-> i2-i1;
        LambdaExpInterface2 lambdaExpInterface21 = (i1,i2)->{
            if(i2<i1){
                throw new RuntimeException("Message : Random");}
            else{
                return i2-i1;
            }
        };
        System.out.println(lambdaExpInterface2.subtract(2050,2080));
        System.out.println(lambdaExpInterface21.subtract(268,300));
        System.out.println(lambdaExpInterface21.subtract(500,300));
    }
}
