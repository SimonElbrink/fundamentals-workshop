package se.lexicon.simon.workshop.week6.pen.dao;

public class PenSequencer {

    private static int penId;

    public static int getLatestAssignedPenId(){
        return penId;
    }

    public static int getNextPenId(){
        return ++penId;
    }

    public static boolean resetCounter(){
        penId = 0;
        return penId == 0 ? true : false;
    }

}
