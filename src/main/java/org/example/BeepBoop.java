 package org.example;

import java.util.ArrayList;
import java.util.List;

public class BeepBoop {

    public ArrayList<Object> runBeepBoop(int i) {
        ArrayList<Object> marks = new ArrayList<>();
        for (int countUpTo = 1; countUpTo <=i; countUpTo++){
            if (countUpTo % 3 ==0 && countUpTo % 5 == 0){
                marks.add("pingPong");

            } else if (countUpTo % 3 ==0) {
                marks.add("ping");

            } else if (countUpTo % 5 == 0) {
                marks.add("pong");

            } else {
                marks.add(countUpTo);
            }

        }
        System.out.println(15);
        return marks;

    }
}
