package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GetterSetterExample> mList = new ArrayList<>();

        mList.add(new GetterSetterExample());
        mList.get(0).setName("Jack");
        mList.get(0).setAge(18);
        mList.get(0).setScore(75.3f);
        mList.get(0).setStudent(true);
        mList.add(new GetterSetterExample("Sam",20,96,false));
        mList.add(new GetterSetterExample("Eddies",15,62,true));

        mList.get(0).setScore(85);
        
        for (int i=0;i<mList.size();i++){
            System.out.println(mList.get(i).getName());
            System.out.println(mList.get(i).getAge());
            System.out.println(mList.get(i).getScore());
            System.out.println(mList.get(i).isStudent());
            System.out.println("========================");
        }
    }
}
