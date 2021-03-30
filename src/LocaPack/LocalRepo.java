package LocaPack;

import java.util.Scanner;

public class LocalRepo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter your favourite colour");
        String colour= sc.next();
        LocalRepo.ShowColour(colour);
    }

    private static String ShowColour(String colour) {
        String danger = "be careful";
        String lucky =" you are a lucky dude";
        if(colour.equalsIgnoreCase("red")){
            System.out.println("my favourite colours is "+ colour+ " and you better  " +danger);
        }else{
            System.out.println("my favourite colours is: "+ colour);

        }
       return colour;
    }
}
