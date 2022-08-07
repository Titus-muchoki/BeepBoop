package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("i am a beepboop application");
        System.out.println("enter a new number");
        try {
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            BeepBoop beepBoop = new BeepBoop();
            ArrayList<Object>  BeepBoopMarks = beepBoop.runBeepBoop(intUserNumber);
            System.out.println(BeepBoopMarks);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}