package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")){
//            System.out.println("test OK");
//        }else{
//            System.out.println("Error!");
//        }


        System.out.println("Testowanie kalkulatora");

        Calculator calculator = new Calculator();
        int add = calculator.add(2,5);

        if (add == 7){
            System.out.println("Dobrze dodaje");
        }else{
            System.out.println("Error");
        }



        int subtract = calculator.subtract(5,3);
        if (subtract == 2){
            System.out.println("Dobrze odejmuje");
        }else{
            System.out.println("Error");
        }

        int subtract2 = calculator.subtract(5,3);
        if (subtract2 == 0){
            System.out.println("Dobrze odejmuje");
        }else{
            System.out.println("Error");
        }
    }
}
