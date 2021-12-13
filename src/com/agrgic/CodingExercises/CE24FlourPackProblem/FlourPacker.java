package com.agrgic.CodingExercises.CE24FlourPackProblem;

public class FlourPacker {


    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // MY WAY
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        if (smallCount >= goal)
            return true;

        boolean sum = false;

        if (bigCount != 0 && bigCount * 5 / bigCount <= goal) {
            for (int i = 5; i <= bigCount * 5; i += 5) {
                if (i + smallCount >= goal && i <= goal) {
                    sum = true;
                    break;
                }
            }
        }

        return sum;

        // BETTER WAY
        /*
        if(bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
            return false;
        }
        if(bigCount*5 + smallCount < goal) { // #2 supply must be greater than demand
            return false;
        }
        return (goal%5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
        */

    } // canPack method


} // FlourPacker class
