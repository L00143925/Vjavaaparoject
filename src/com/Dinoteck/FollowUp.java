package com.Dinoteck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FollowUp {
    public static void main(String[] args) {
       Family FF = new Family("Kelleb");
          FF.add(new Family("Ezeoha"));
        System.out.println(FF.getName());
    }

}
 class Family{
    private String name;
   ArrayList<Family> family;

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


     public void add(Family families){
                    families = new Family(name);
     }


}