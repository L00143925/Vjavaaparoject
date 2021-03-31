package com.Dinoteck;

import java.util.ArrayList;
import java.util.List;

public class FollowUp {
    public static void main(String[] args) {
        Family FF = new Family("udoku");
        System.out.println(FF.getName());

    }

}
 class Family{
    private String name;
    List<Family> family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My Family is : " + name + '\'' +
                ", family=" + family +
                '}';
    }

    Family(String  name){
        this.name= name;
        family = new ArrayList<>();
    }





}