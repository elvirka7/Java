package day39_Recap.statesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StateObjects {
    public static void main(String[] args) {

        California californiaState = new California("Democratic", "Gavin Newsom", "Alex Padilla", 39510000, 12.3);
        Florida floridaState = new Florida("Republican", "Ron DeSantis","Marco Rubio", 21480000, 6 );
        Texas texasState = new Texas("Republican", "Greg Abbott", "Tex Cruz", 29000000, 6.25);
        Virginia virginiaState = new Virginia("Republican", "Glenn Youngkin", "Tim Kaine", 8536000, 5.3 );

        ArrayList<States> statesList = new ArrayList<>(Arrays.asList(californiaState, floridaState, texasState, virginiaState));

        for (States states : statesList) {
            states.isKnownFor();
        }

        System.out.println("\n\nFull information about each state");
        System.out.println(statesList);


        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (States states : statesList) {
            if(min>states.getStateTaxRate()) {
                min = states.getStateTaxRate();
            }
            if (max < states.getStateTaxRate()) {
                max = states.getStateTaxRate();
            }
        }

        System.out.println("\n\nThe smallest tax between four states is "+min);
        System.out.println("The highest tax between four states is "+max);


   }

}
