package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> list){

        ArrayList<Integer> listNew = new ArrayList<>();

        for(Integer x: list){
            if (x % 2 !=0){
            }
            else{
                listNew.add(x);
            }
        }


        return listNew;
    }
}
